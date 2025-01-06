import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Year to know weather it is leap or not :- ");
        int num = input.nextInt();
        if(((num%4 == 0) && (num %100 != 0)) || (num%400 == 0)){
            System.out.println(num+" is leap year");
        }
        else{
            System.out.println("Common Year");
        }
    }
}
