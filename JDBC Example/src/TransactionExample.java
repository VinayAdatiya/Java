import services.LoginService;
import services.SignUpService;

import java.util.Scanner;

public class TransactionExample {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("1.Login\n2.SignUp\n3.Exit\nEnter Your Choice Number :- ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    LoginService loginService = new LoginService();
                    loginService.validateUser(null, null);
                    break;
                case 2:
                    SignUpService signUpService = new SignUpService();
                    signUpService.signUpUser();
                    break;
                case 3:
                    System.out.println("=== Exiting !!! ===");
                    exitFlag = false;
                    break;
            }
        }
    }
}
