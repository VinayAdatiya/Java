import java.util.Scanner;

public class Armstrong {
    private int num;
    private int length;
    public Armstrong(Scanner input){
        System.out.println("---Armstrong Number---");
        System.out.println("Enter the Number :- ");
        num = input.nextInt();
        length = Integer.toString(num).length();
    }

    public void checkArmstrong(){
        int ans = 0;
        int temp = num;
        while(temp > 0){
            ans += Math.pow(temp%10,length);
            temp = temp/10;
        }
        if(ans == num){
            System.out.println(num+" is Armstrong Number");
        }
        else{
            System.out.println(num+" is not a Armstrong Number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Armstrong obj = new Armstrong(input);
        obj.checkArmstrong();
    }
}
