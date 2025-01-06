import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number :- ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int temp;
        System.out.println("Fibonacci Sreies :- ");
        if(num == 1){
            System.out.println(a);
        }
        else if(num == 2){
            System.out.println(a+" "+b+" ");
        }
        else{
            System.out.print(a+" "+b+" ");
            for(int i=3;i<=num;i++){
                temp= a+b;
                System.out.print(temp+" ");
                a = b;
                b = temp;
            }
        }
        input.close();
    }
}
