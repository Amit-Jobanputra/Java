package Java;
import java.sql.*;
import java.util.*;
public class PreParedstmt {
    public static void main(String[] args) {
        Connection con;
        PreparedStatement pst;
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            pst=con.prepareStatement("insert into stud values(?,?)");
            System.out.println("Enter Your Roll Number:-");
            int roll = sc.nextInt();
            System.out.println("Enter Your Name :-");
            String name = sc.next();
            pst.setInt(1, roll);
            pst.setString(2, name);
            int ans =pst.executeUpdate();
            System.out.println(ans+" Record Inserted");
            con.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
