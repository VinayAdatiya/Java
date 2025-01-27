// The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.
package ThisKeyword;
class B {
    B(){
        this(10,20); //must be first line in constructor
        System.out.println("hello a");
    }
    B(int x){
        this();
        System.out.println(x);
    }
    B(int x ,int y){
        System.out.println("parameterized constructor");
        System.out.println(x+y);
    }
}
public class Example2 {
    public static void main(String args[]){
        B a=new B(10);
    }
}

