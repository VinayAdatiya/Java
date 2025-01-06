import java.util.Scanner;

public class AgeValidation {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age :- ");
        int age = Integer.parseInt(input.nextLine());
        if(age>=18){
            System.out.println("You are eligible for the voting card");
        }
        else{
            System.out.println("You are no eligible for the voting card");
        }
    }


}
