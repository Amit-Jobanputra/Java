
package Java;
import java.sql.*;
public class DbData {
    public static void main(String[] s){
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
//            PreparedStatement ps=con.prepareStatement("insert into stud values(?,?)");
//            ps.setInt(1, 1);
//            ps.setString(2, "dev");
//            ps.executeUpdate();
//        }catch(Exception e){
//            System.err.println(e);
//        }
 try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
//            PreparedStatement ps=con.prepareStatement("insert into stud values(?,?)");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select *from stud");
while(rs.next()){
    System.out.printf("%-5d %-15s",rs.getInt("Roll"),rs.getString("Name"));
}
//            ps.setInt(1, 1);
//            ps.setString(2, "dev");
//            ps.executeUpdate();
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
