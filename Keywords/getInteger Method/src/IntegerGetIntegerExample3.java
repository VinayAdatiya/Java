import java.util.Scanner;

public class IntegerGetIntegerExample3 {
    public static void main(String args[]){
        System.setProperty("test.integer","100");
        System.out.println("Enter the desired output string: ");
        Scanner readString = new Scanner(System.in);
        String str = readString.next();
        System.out.println("Default Value = "+Integer.getInteger(str));
        readString.close();
        str="Java";
        System.out.println("Custom Value = "+Integer.getInteger(str));
    }
}
