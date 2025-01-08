//Two ways to print ASCII Value
//Assigning a Variable to the int Variable
//Using Type-Casting
public class ASCIIValue {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'b';

        int asciival1 = ch1;
        int asciival2 = ch2;

        System.out.println("The ASCII Value of "+ch1+" is : "+asciival1);
        System.out.println("The ASCII Value of "+ch2+" is : "+asciival2);

//        int ch1 = 'a'; --> 97
//        int ch2 = 'b'; --> 98


        for(int i=33;i<=126;i++){
            System.out.println("The ASCII Value of "+(char)i+" = "+i);
        }

    }
}
