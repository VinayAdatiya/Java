package Examples;
import com.java.B;
public class Example2 {
    public static void main(String args[]){
        B a = new B("Try to create the instance of public constructor outside the package");
        System.out.println(a.msg);
        a.display();
    }
}
