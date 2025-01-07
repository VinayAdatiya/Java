import java.util.Scanner;

public class Pattern3 {
    private int num;
    public Pattern3(Scanner input){
        System.out.println("---Pyramid Star Pattern---");
        System.out.println("Example");
        System.out.println("    *");
        System.out.println("   * *");
        System.out.println("  * * *");
        System.out.println(" * * * *");
        System.out.println("Enter the Number :- ");
        num = input.nextInt();
    }
    public void printPattern(){
        for(int i=0;i<num;i++){
            for(int j=0;j<=num;j++){
                if(j<=(num-i-1)){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern3 obj = new Pattern3(input);
        obj.printPattern();
        input.close();
    }
}
