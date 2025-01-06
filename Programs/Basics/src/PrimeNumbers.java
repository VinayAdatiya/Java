import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String args[]){
        int flag = 0 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int num = input.nextInt();
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                System.out.println(num+" is not a Prime number !!!");
                flag = 1;
                break;
            }
        }
        if(flag != 1){
            System.out.println(num+" is a Prime number !!!");
        }
    }
}
