import java.util.Scanner;

class Calculations{
    private boolean ans;
    public boolean getAnswer(int num){
        System.out.println("Using Reverse String Logic :- ");
        String Org = Integer.toString(num);
        String reversed = new StringBuilder(Org).reverse().toString();
        ans = (reversed.equals(Org))?true:false;
        return ans;
    }
}

public class Palindrome {
    //Constructor
    public Palindrome(){

    }

    public void checkPalindrome(int num){
        System.out.println("Using main Logic mod 10 divide 10 :- ");
        int temp = num;
        int reversed = 0;
        int mod = 0;
        while(temp != 0){
            mod = temp%10;
            reversed = reversed * 10 +mod;
            temp = temp/10;
        }
        if(reversed == num){
            System.out.println(num+" is Palindrome");
        }
        else{
            System.out.println(num+" is not a Palindrome Number");
        }
    }

    public static void main(String args[]){

        //Calculations Class object
        Calculations obj = new Calculations();

        //Initializing Scanner
        Scanner input = new Scanner(System.in);

        //Taking Input from the User
        System.out.println("---Palindrome Number---");
        System.out.println("Enter the Number :- ");
        int num = input.nextInt();

        //Calling Calculation class method named as get Answer
        boolean answer = obj.getAnswer(num);

        //Conditional Checking for Output Print
        if(answer){
            System.out.println(num+" is Palindrome");
        }
        else{
            System.out.println(num+" is not a Palindrome Number");
        }

        //Creating Obj of Palindrome class
        Palindrome obj1 = new Palindrome();

        obj1.checkPalindrome(num);
    }
}
