import java.util.Scanner;

public class Grades {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your total marks(out of 600) :- ");
        int marks = input.nextInt();
        int percentage = marks/6;
        System.out.println("Percentage :- "+percentage);
        if(percentage >= 90 && percentage<=100){
            System.out.println("Congratulations You Passed your Examination with A+ Grade");
        }
        else if(percentage >= 80 && percentage<90){
            System.out.println("Congratulations You Passed your Examination with A Grade");
        }
        else if(percentage >= 70 && percentage<80){
            System.out.println("Congratulations You Passed your Examination with B+ Grade");
        }
        else if(percentage >= 60 && percentage<70){
            System.out.println("Congratulations You Passed your Examination with B Grade");
        }else if(percentage >= 50 && percentage<60){
            System.out.println("Congratulations You Passed your Examination with C+ Grade");
        }
        else if(percentage >= 33 && percentage<50){
            System.out.println("Congratulations You Passed your Examination with C Grade");
        }
        else{
            System.out.println("Unfortunately, you did not pass your examination.");
        }
    }
}
