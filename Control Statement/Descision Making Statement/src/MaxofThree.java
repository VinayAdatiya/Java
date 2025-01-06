public class MaxofThree {
    public static void main(String args[]){
        int a = 10;
        int b = 50;
        int c = 30;
        if( a >= b){
            if( a >= c ){
                System.out.println("A is the Largest Number");
            }
            else{
                System.out.println("C is the Largest Number");
            }
        }
        else{
            if( b >= c ){
                System.out.println("B is the Largest Number");
            }
            else{
                System.out.println("C is the Largest Number");
            }
        }
    }
}
