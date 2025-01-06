class F{
    private void display(){
        System.out.println("Parent class method");
    }
}
public class Example5 extends F{
    public void display(){
        System.out.println("Child Class Method");
    }
    public static void main(String args[]){
        Example5 obj = new Example5();
        obj.display();
    }
}
