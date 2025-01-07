import java.util.Scanner;

public class Pattern2 {
    private int num;
    public Pattern2(Scanner input){
        System.out.println("---Diamond Pattern---");
        System.out.println("Example");
        System.out.println("    *");
        System.out.println("   * *");
        System.out.println("  * * *");
        System.out.println(" * * * *");
        System.out.println("  * * *");
        System.out.println("   * *");
        System.out.println("    *");
        System.out.println("Enter the Number :- ");
        num = input.nextInt();
    }
    public void printPattern(){
        for(int i=0;i<num;i++){
            for(int j=0;j<=num;j++){
                if(j<=(num-i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
        for(int i =0;i<num;i++){
            for(int j=0;j<=num;j++){
                if(j<=i){
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
        Pattern2 obj = new Pattern2(input);
        obj.printPattern();
        input.close();
    }
}
