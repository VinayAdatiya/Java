import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateExample {
    public static void main(String[] args) throws Exception {
        String city = "Mumbai";
        String email = "raj@gmail.com";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","password123#");
        System.out.println(connection);
        PreparedStatement ps = connection.prepareStatement("update register set city=? where email=?");
        ps.setString(1,city);
        ps.setString(2,email);
        int count = ps.executeUpdate();
        if(count>0){
            System.out.println("Updated Successfully");
        }
        else{
            System.out.println("Failed to Update");
        }
        connection.close();
    }
}
