class A {
    private String msg = "Hello World";

    private String getMsg() {
        return msg;
    }
}

public class Example1 {
    public static void main(String args[]) {
        A a = new A();
        try {
//            System.out.println(a.msg); // Trying to access private field
//            System.out.println(a.getMsg()); // Trying to access private method
        } catch (Exception e) {
            System.out.println("You do not have access to the private field!!!");
            System.out.println("Error: " + e);
        }
    }
}
