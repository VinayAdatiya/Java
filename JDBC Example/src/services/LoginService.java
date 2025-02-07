package services;

import entity.Gender;
import entity.Register;
import utils.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginService {
    public void validateUser(String email, String password) throws Exception {
        Scanner input = new Scanner(System.in);
        if (email == null && password == null) {
            System.out.println("Enter the Email :- ");
            email = input.nextLine();
            System.out.println("Enter the Password :- ");
            password = input.nextLine();
        }

        Connection connection = (new DBConnection()).getDBConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM register WHERE email = ? and password = ?");
        ps.setString(1, email);
        ps.setString(2, password);
        Register user = null;
        try {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new Register(
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        Gender.valueOf(rs.getString("gender").toUpperCase()),
                        rs.getString("city")
                );
                System.out.println("=== User Logged in Successfully !!! ===");
            }
            if (connection != null)
                connection.close();
            if (rs != null)
                rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("=== App Launched Successfully !!! ===");
        boolean logout_flag = true;
        while (logout_flag) {
            System.out.println("1.Visit Profile\n2.Logout\nEnter Your Choice :- ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("=== Profile ===");
                    System.out.println(user);
                    System.out.println("=== Back to HomePage ===");
                    break;
                case 2:
                    user = null;
                    System.out.println("=== Logout Successfully ===");
                    logout_flag = false;
                    break;
            }
        }
    }
}
