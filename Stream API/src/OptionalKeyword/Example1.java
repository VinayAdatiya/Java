package OptionalKeyword;

import java.util.Optional;

public class Example1 {
    public static void main(String[] args) {
        // Ways of creating Optional Object
        // 1. using Optional.empty()
        Optional<String> emptyObj = Optional.empty();
        System.out.println(emptyObj.isPresent()); //if there is a value inside the Optional object
        System.out.println(emptyObj.isEmpty());

        // 2. using Optional.of()
        Optional<String> nameObj = Optional.of("Vinay");
        System.out.println(nameObj.isPresent()); //true
        System.out.println("nameObj value :- "+nameObj);

        String name = null;
        //Optional<String> nameObj2 = Optional.of(name);  //Throw an runtimeError NullPointerException
        Optional<String> nameObj2 = Optional.ofNullable(name);
        String nameObj3 = Optional.ofNullable(name).orElseGet(()->"Vinay");
        System.out.println(nameObj2.isPresent()); //false
//        System.out.println(nameObj3.isPresent()); //always true due to orElseGet
        System.out.println("nameObj2 value :- "+nameObj2);
        System.out.println("nameObj3 value :- "+nameObj3);

        //Throw
        String productNull = null;
        String product1 = "Laptop";
        String pObj1,pObj2;
        // Default orElseThrow throws NoSuchElementException
        try{
            pObj1 = Optional.ofNullable(productNull).orElseThrow(IllegalArgumentException::new);
            System.out.println(pObj1);
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        try{
            pObj2 = Optional.ofNullable(product1).orElseThrow(IllegalArgumentException::new);
            System.out.println(pObj2);
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }

        //Conditional Return With filter()
        class Product{
            String title;
            int price;

            public Product(String title, int price) {
                this.title = title;
                this.price = price;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
            public void search(Product product){
                if (product != null || product.getPrice() != 0){
                    if (product.getPrice()>10000 && product.getPrice()<20000) {
                        System.out.println("true");
                    }
                }
                else{
                    System.out.println("false");
                }
            }
            public void searchAuto(Product product){
                System.out.println(
                        Optional
                                .ofNullable(product)
                                .map(Product::getPrice)
                                .filter(p -> p>10000 && p<20000)
                                .isPresent());
            }
        }

        System.out.println("-----Manually-----");
        Product p = new Product("Default",99999);
        p.search(new Product("Laptop",15000));
        p.search(new Product("Mac",25000));
        p.search(new Product("Mobile",18000));
        p.search(null);

        System.out.println("-----Using Optional-----");
        Product p2 = new Product("Default",99999);
        p2.searchAuto(new Product("Laptop",15000));
        p2.searchAuto(new Product("Mac",25000));
        p2.searchAuto(new Product("Mobile",18000));
        p2.searchAuto(null);


    }
}
