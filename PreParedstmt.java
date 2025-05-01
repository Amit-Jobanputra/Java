package Java;
import java.sql.*;
import java.util.*;
public class PreParedstmt {
    public static void main(String[] args) {
        Connection con;
        PreparedStatement pst;
        Scanner sc = new Scanner(System.in);
        ResultSet rs;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
//            pst=con.prepareStatement("insert into stud values(?,?)");
//            System.out.println("Enter Your Roll Number:-");
//            int roll = sc.nextInt();
//            System.out.println("Enter Your Name :-");
//            String name = sc.next();
//            pst.setInt(1, roll);
//            pst.setString(2, name);
//            int ans =pst.executeUpdate();
//            System.out.println(ans+" Record Inserted");
            //   pst= con.prepareStatement("select * from stud where Roll=?");
            //   System.out.println("Enter Roll to Get The Recorde :-");
            //   int a = sc.nextInt();
            //   pst.setInt(1, a);
            //   rs = pst.executeQuery();
            //   while(rs.next())
            //   {
            //       int b= rs.getInt(1);
            //       String s = rs.getString(2);
            //       System.out.println("Roll Number :-"+b+"Name :-"+s);
            //   }
            pst = con.prepareStatement("Delete From stud where Roll =?")
            System.out.println("Enter Roll to Get The Recorde :-");
            int a = sc.nextInt();
            pst.setInt(1, a);
            int a = pst.executeUpdate();
            System.out.println(a+" Record Deleted")

            con.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
