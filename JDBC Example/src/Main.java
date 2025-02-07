import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) throws Exception{

        String name = "Raj";
        String email = "raj@gmail.com";
        String password = "raj@5252";
        String gender = "male";
        String city = "Surat";
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","password123#");

//        PreparedStatement ps = con.prepareStatement("INSERT INTO register VALUES('Vinay','vinay@gmail.com','pass@123','male','Surat')");
//        PreparedStatement ps1 = con.prepareStatement("INSERT INTO register VALUES( ' "+name+" ','"+email+"','"+password+"','"+gender+"','"+city+"')");
        PreparedStatement ps = con.prepareStatement("INSERT INTO register VALUES(?,?,?,?,?)");
        ps.setString(1,name);
        ps.setString(2,email);
        ps.setString(3,password);
        ps.setString(4,gender);
        ps.setString(5,city);


        int i = ps.executeUpdate();

        if(i>0){
            System.out.println("Successfully Registered !!!");
        }
        else{
            System.out.println("Failed");
        }
    }
}
