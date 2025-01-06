import java.lang.reflect.Method;
class D{
    private void display(){
        System.out.println("Private Method is Invoked");
    }
}
public class Example3 {
    public static void main(String args[]) throws Exception{
        Class c = Class.forName("D");
        Object o = c.newInstance();
        Method m =c.getDeclaredMethod("display", null);
        m.setAccessible(true);
        m.invoke(o, null);
    }
}
