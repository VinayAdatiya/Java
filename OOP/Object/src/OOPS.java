class Animal2 {
    protected String name;

    //constructor
    public Animal2(String name){
        this.name = name;
    }

    //Encapsulation: Getter method
    public String getName(){
        return name;
    }

    //Method that needs to be overridden
    public void makeSound(){
        System.out.println("Some Sound");
    }
}

//Derived class Inheritance (Dog IS-A Animal)
class Dog extends Animal2 {
    //Dog Class Constructor
    public Dog(String name) {
        super(name);
    }

    //Polymorphism: Overriding Method
    @Override
    public void makeSound(){
        System.out.println("Woof Woof");
    }
}

//Derived class Inheritance (Cat IS-A Animal)
class Cat extends Animal2 {
    //Dog Class Constructor
    public Cat(String name) {
        super(name);
    }

    //Polymorphism: Overriding Method
    @Override
    public void makeSound(){
        System.out.println("Meow Meow");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Dog d1 = new Dog("Goldy");
        Cat c1 = new Cat("Buddy");

        System.out.println("Dog Name :- "+d1.getName());
        d1.makeSound();

        System.out.println("Cat Name :- "+c1.getName());
        c1.makeSound();
    }
}
