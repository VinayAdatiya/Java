public class IntegerGetIntegerExample2 {
    public static void main(String args[]){
        System.out.println("Default Property Value of sun.arch.data.model => "+Integer.getInteger("sun.arch.data.model"));

        //setting up a custom property
        System.setProperty("test.integer","100");
        System.out.println("Custom value of test.integer => "+Integer.getInteger("test.integer"));
    }
}
