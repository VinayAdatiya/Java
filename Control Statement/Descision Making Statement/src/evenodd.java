import java.util.Scanner;
public class evenodd {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check weather it is even or not :-");
        int num = Integer.parseInt(input.nextLine());
        if(num%2 == 0 ){
            System.out.println(num+" is even number !!!");
        }
        else{
            System.out.println(num+" is even number !!!");
        }
    }
}
