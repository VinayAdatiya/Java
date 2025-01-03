public class IntegerGetIntegerExample1 {
    public static void main(String args[]){
        String str = "sun.arch.data.model";
        System.out.println(str);
        System.out.println("Value = "+Integer.getInteger(str));
        str="Java";
        System.out.println("Value = "+Integer.getInteger(str));
    }
}
