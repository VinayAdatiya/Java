class A{
    //Field
    public String msg = "Hello";

    //Method
    public void msg(){
        System.out.println("Hello Java");
    }

    //constructor
    public A(String info){
        this.msg = info;
        System.out.println(msg);
        this.msg="Hello";
    }
}
public class Example1{

    public static void main(String args[]){
        A a = new A("Try to create the instance of public constructor outside the class");
        System.out.println(a.msg);
        a.msg();

    }
}
