import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class fetchExample {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","password123#");
        PreparedStatement ps = con.prepareStatement("select * from register");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println("Name :- "+rs.getString("name"));
            System.out.println("Email :- "+rs.getString("email"));
            System.out.println("entity.Gender :- "+rs.getString("gender"));
            System.out.println("City :- "+rs.getString("city"));
        }
        con.close();
    }
}
