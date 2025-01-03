import java.net.SocketOption;

//String.valueOf() method is a multipurpose static method
//major function lies in the conversion of types of data
//    Ex primitive types and objects, into strings.
//    method is overloaded with numerous forms, each of that is designed to handle specific data types.
public class StringValueOfExample {
    //Constructor
    public StringValueOfExample(){

    }

    public static void main(String args[]){

        int value=30;                // Example int value
        String s1=String.valueOf(value);
        System.out.println(s1+10);

        boolean val = true;          // Example boolean value
        s1= String.valueOf(val);
        System.out.println(s1+20);

        char myChar = 'A';           // Example char value
        s1 = String.valueOf(myChar);
        System.out.println(s1+20);

        long myLong = 123456789L;    // Example long value
        s1 = String.valueOf(myLong);
        System.out.println(s1+20);

        float myFloat = 123.45f;     // Example float value
        s1 = String.valueOf(myFloat);
        System.out.println(s1+20);

        double myDouble = 987.654;   // Example double value
        s1 = String.valueOf(myChar);
        System.out.println(s1+20);

        Integer IntObject = 1223;    // Example Integer Object
        s1 = String.valueOf(IntObject);
        System.out.println(s1+20);

        Double DoubleObject = 1223.456;    // Example Integer Object
        s1 = String.valueOf(DoubleObject);
        System.out.println(s1+20);
    }
}
