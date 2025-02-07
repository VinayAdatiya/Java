import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteExample {
    public static void main(String[] args) throws Exception {
        String email = "raj@gmail.com";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","password123#");

        PreparedStatement ps = con.prepareStatement("delete from register where email=?");
        ps.setString(1,email);

        if(ps.executeUpdate()>0){
            System.out.println("Deleted Successfully");
        }
        else{
            System.out.println("Failed to Delete !!!");
        }
    }
}
