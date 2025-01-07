import java.util.Scanner;

public class Factorial {
    private int num;
    public Factorial(Scanner input){
        System.out.println("Enter the Number :- ");
        this.num = input.nextInt();
    }

    public void calculateFactorial(){
        int temp = num;
        int ans = 1;
        while(temp > 0){
            ans = ans * temp;
            temp--;
        }
        System.out.println("Factorial of "+num+" is "+ans);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Factorial obj = new Factorial(input);
        obj.calculateFactorial();
        input.close();
    }
}
