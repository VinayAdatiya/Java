package services;

import entity.Gender;
import entity.Register;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class SignUpService {
    private boolean validatePassword(String password) {
        final int MAX = 8; // Specify the maximum number of letters in a password
        final int MIN_Uppercase = 2; // Specifying the number of uppercase letters in password
        final int MIN_Lowercase = 2; // Specifying the minimum lowercase letters in password
        final int NUM_Digits = 2; // Specifying the number of digits in a password
        final int Special = 2; // Specify the minimum number of special case letters
        int uppercaseCounter = 0; // Count number of uppercase letters in a password
        int lowercaseCounter = 0; // Counter lowercase letters in a password
        int digitCounter = 0; // Count digits in a password
        int specialCounter = 0; // count special case letters in a password

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c))
                uppercaseCounter++;

            else if (Character.isLowerCase(c))
                lowercaseCounter++;

            else if (Character.isDigit(c))
                digitCounter++;

            if (c >= 33 && c <= 46 || c == 64)
                specialCounter++;
        }

        if (password.length() >= MAX && uppercaseCounter >= MIN_Uppercase
                && lowercaseCounter >= MIN_Lowercase && digitCounter >= NUM_Digits && specialCounter >= Special) {
            System.out.println("Valid Password");
            return true;
        } else {
            System.out.println("Your password does not contain the following:");
            if (password.length() < MAX)
                System.out.println("atleast 8 characters");

            if (lowercaseCounter < MIN_Lowercase)
                System.out.println("Minimum lowercase letters");

            if (uppercaseCounter < MIN_Uppercase)
                System.out.println("Minimum uppercase letters");

            if (digitCounter < NUM_Digits)
                System.out.println("Minimum number of numeric digits");

            if (specialCounter < Special)
                System.out.println("Password should contain at lest 3special characters");
        }
        return false;
    }

    public void signUpUser() throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name :- ");
        String name = input.nextLine();

        System.out.println("Enter Your Email :- ");
        String email = input.nextLine();
        boolean validPasswordFlag = true;
        String password = null;
        while (validPasswordFlag) {
            System.out.println("Enter Your Password :- ");
            password = input.nextLine();
            validPasswordFlag = !validatePassword(password);
        }


        System.out.println("Enter Your Gender (E.x. MALE/FEMALE) :- ");
        Gender gender = Gender.valueOf(input.nextLine());

        System.out.println("Enter Your City :- ");
        String city = input.nextLine();

        Register user = new Register(name, email, password, gender, city);


        Connection connection = (new DBConnection()).getDBConnection();
        connection.setAutoCommit(false);
        PreparedStatement ps = connection.prepareStatement("INSERT INTO register VALUES(?,?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, password);
        ps.setString(4, gender.toString());
        ps.setString(5, city);
        if (ps.executeUpdate() > 0) {
            System.out.println("=== " + user.getName() + " is Successfully Registered !!! ===");
            connection.commit();
            System.out.println("=== Transaction Successfully Committed ===");
            System.out.println("=== Redirecting to Login !!! ===");
            LoginService loginService = new LoginService();
            loginService.validateUser(email, password);
        } else {
            System.out.println("=== Error :- SignUp Failed !!! ===");
            System.out.println("=== Transaction Rollback ===");
            connection.rollback();
        }

        connection.commit();
        connection.close();
    }
}
