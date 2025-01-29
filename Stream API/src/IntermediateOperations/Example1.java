package IntermediateOperations;

import java.util.*;
import java.util.stream.Collectors;

class Product{
    private int id;
    private String title;
    private float price;

    public Product(int id, String title, float price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
public class Example1 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenovo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",59000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        productsList.add(new Product(6,"HP Envy Laptop",125000f));
        productsList.add(new Product(7,"HP Pavilion",25000f));
        productsList.add(new Product(7,"HP Pavilion",125000f));


        //Fetching all product price between 25000 and 60000
        System.out.println("Price Between 25000 to 60000 :- ");
        List<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.getPrice() > 25000 && p.getPrice()<60000)// filtering data
                .map(Product::getPrice)        // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList2);

        //printing all product name whose price is greater than 60000
        System.out.println("Print Title where price > 60000 :- ");
        productsList.stream().filter(p->p.getPrice() >60000).forEach(p-> System.out.println(p.getTitle()));

        //sum of all product price
        System.out.println("Sum of all Product Price :- ");
        Double tp = productsList.stream().mapToDouble(Product::getPrice).sum();
        System.out.println(tp);

        //filter all products starts with HP and store it into the another list
        System.out.println("Product List starts with HP :- ");
        List<String> hpProducts = productsList
                .stream()
                .map(Product::getTitle)
                .filter(p -> p.startsWith("HP")).toList();
        System.out.println(hpProducts);

        //flatmap() example
        List<List<Integer>> nestedList = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList(1,2,3,4),
                        Arrays.asList(7,8,5,6),
                        Arrays.asList(10,9,11,12))
        );
        List<Integer> listInteger = nestedList
                .stream()
                .flatMap(Collection::stream)
                .sorted().toList();
        System.out.println("Nested Integer List Sorted with flatMap() :- ");
        System.out.println(listInteger);

        //Reduce()

        //get the highest length word from the product list
        Optional<String> word = productsList
                .stream()
                .map(Product::getTitle)
                .reduce((p1,p2)->p1.length()>p2.length()?p1:p2);
        System.out.println("Longest Title :- "+word.get());

        //combine string
        Optional<String> st = productsList
                .stream()
                .map(Product::getTitle)
                .reduce((p1,p2)->p1+"-"+p2);
        System.out.println("Combine String with '-' :- "+st.get());

        //sum of all elements using reduce
        double totalPrice = productsList
                .stream()
                .mapToDouble(Product::getPrice)
                .reduce((p1, p2)->p1+p2)
                .orElse(0.0);
        System.out.println("sum of all products :- "+totalPrice);

        //distinct
        System.out.println("All Unique Prices :- ");
        productsList.stream().map(Product::getPrice).distinct().forEach(System.out::println);
        System.out.println("All Unique Brands :- ");
        productsList
                .stream()
                .map(Product::getTitle)
                .map(p->p.split(" ")[0])
                .distinct()
                .forEach(System.out::println);
        System.out.println("Number of Unique Brands :- ");
        long count = productsList
                .stream()
                .map(Product::getTitle)
                .map(p->p.split(" ")[0])
                .distinct()
                .count(); //By default, count returns long
        System.out.println(count);

        //Peek()
        //peek() is mainly used for debugging or observing elements
        long titleCount = productsList
                .stream()
                .map(Product::getTitle)
                .peek(System.out::println)
                .count(); // it will print nothing
        System.out.println(titleCount);
    }
}
