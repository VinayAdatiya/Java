
import java.util.Scanner;
public class City {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the City of your name :- ");
            String name = scanner.nextLine();
            if(name.equals("Surat")){
                System.out.println("Welcome to the Diamond City of India");
            }
            else if(name.equals("Mumbai")){
                System.out.println("Welcome to the Finance Capital of India");
            }
            else if(name.equals("Banglore")){
                System.out.println("Welcome to the IT Hub of India");
            }
            else {
                System.out.println("Welcome to "+name);
            }
        }
}
