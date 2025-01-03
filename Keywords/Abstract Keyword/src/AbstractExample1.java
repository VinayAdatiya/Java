abstract class Vehicle{
    //Abstract class constructor
    String st;
    Vehicle(String st){
        this.st = st;
    }

    void display(){
        System.out.println(st);
    }

    //abstract method
    abstract void bike();
    //overloaded abstract method
    abstract void bike(String name);

    //non-abstract method
    void car(){
        System.out.println("Car is Running");
    }

    //Nested Abstract Class
    abstract class Car{
        abstract void display();
    }
}
class Honda extends Vehicle{
    Honda(String st){
        super(st);
        System.out.println("Honda Class Constructor is here");
    }
    @Override
    void bike(){
        System.out.println("Bike is Running");
    }
    @Override
    void bike(String name){
        System.out.println(name+" is Running");
    }

    class FourWheller extends Car{
        @Override
        void display(){
            System.out.println("Nested abstract class is invoked");
        }
    }

}
public class AbstractExample1 {
    //Constructor
    public AbstractExample1(){
        System.out.println("AbstractExample Class Constructor is here");
    }

    public static void main(String args[]){
        Honda obj = new Honda("Hello Constructor");
        obj.bike();
        obj.bike("Audi");
        obj.car();
        obj.display();

        Honda.FourWheller fw = obj.new FourWheller();
        fw.display();

    }
}

