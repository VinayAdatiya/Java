
class Building{
    abstract class Car{
        abstract void display();
    }
    class Honda extends Car{
        @Override
        void display(){
            System.out.println("Inner Abstract Class");
        }
    }
}


public class AbstractExample2{
    public static void main(String args[]){
        Building obj = new Building();
        Building.Car c = obj.new Honda();
        c.display();
    }
}
