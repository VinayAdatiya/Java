package Constructor;

class Animal{
    private int id;
    protected String name;
    private String category;
    protected int since = 1234;

    public Animal(int id , String name , String cat){
        this.id = id;
        this.name = name;
        this.category = cat;
    }

    public Animal(){
        this(0,null,null);
    }

    public void displayInfo(){
        System.out.println("Animal Class displayInfo ");
        System.out.print("\nID :- "+id+ " Name :- "+name+" Category :- "+category);
    }

    void makeSound(){
        System.out.println("\nSome Sound");
    }
}
class Dog extends Animal{
    private String breed;
    public Dog(int id , String name , String cat , String breed){
        super(id , name , cat);
        this.breed = breed;
    }
    public Dog(){
        this(0,"Unknown","Unknown","Unknown");
    }

    @Override
    public void displayInfo(){
        System.out.println("\nDog class displayInfo :- ");
        super.displayInfo();
        System.out.print(" Breed :- "+breed);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.displayInfo();
        obj.makeSound();
        System.out.println(obj.name);
        obj.name = "Hello";
        System.out.println(obj.name);
    }
}
