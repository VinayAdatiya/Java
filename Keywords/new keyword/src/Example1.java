import java.nio.channels.SelectableChannel;
import java.util.*;
public class Example1 {
    //Constructor
    public Example1() {
        System.out.println("Invoking Constructor");
    }

    public Example1(int a, int b) {
        System.out.println("Parameterized Constructor " + "Value of a" + a + "Value of b" + b);
    }

    //Method Without Parameter
    public void display() {
        System.out.println("Invoking Non Parameterized Method");
    }

    //Parameterized Method
    public void display(int a) {
        System.out.println("Invoking Parameterized Method" + "Value of a" + a);
    }

    //Main Method
    public static void main(String args[]) {
        Example1 obj1 = new Example1();
        Example1 obj2 = new Example1(10, 20);
        obj1.display();
        obj2.display(20);

        int arr[] = new int[3];
        System.out.println("Array length:" + arr.length);

        int[] arr1 = {1, 2, 3};
        System.out.println("Array1 :- " + Arrays.toString(arr1));
        arr1[0] = 10;
        System.out.println("Array1 :- " + Arrays.toString(arr1));
        int fe = arr[0];
        System.out.println("fe of Array1 :- " + fe);
        System.out.println("Array1 :- " + Arrays.toString(arr1));
    }
}
