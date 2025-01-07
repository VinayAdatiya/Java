import java.util.Scanner;

public class Pattern4 {
    private int num;
    public Pattern4(Scanner input){
        System.out.println("---Star Pattern 1---");
        System.out.println("Example");

        System.out.println("Enter the Number :- ");
        num = input.nextInt();
    }
    public void printPattern(){
        for(int i=0;i<num;i++){
            for(int j=0;j<=num;j++){
                if(j<=i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern4 obj = new Pattern4(input);
        obj.printPattern();
        input.close();
    }
}
