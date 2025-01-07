import java.util.Scanner;

public class Pattern1 {
    private int num;
    public Pattern1(Scanner input){
        System.out.println("---Star Pattern 1---");
        System.out.println("Example");
        System.out.println("* ");
        System.out.println("* * ");
        System.out.println("* * * ");
        System.out.println("* * * * ");
        System.out.println("Enter the Number :- ");
        num = input.nextInt();
    }
    public void printPattern(){
        for(int i = 0;i<num;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern1 obj = new Pattern1(input);
        obj.printPattern();
        input.close();
    }
}
