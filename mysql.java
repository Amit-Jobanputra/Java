package Java;
import java.sql.*;
public class mysql {
    public static void main(String [] args){
        Connection con;
        Statement st;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            System.out.println("DB connected...");
            st=con.createStatement();
//            st.execute("Create Table stud(Roll int, Name varchar(25))");
//            System.out.println("Table Created");
            int ans=st.executeUpdate("insert into stud values(1,'Amit')");
            System.out.println(ans+" Record Inserted");
            con.close();
        }
        catch(Exception e){
            
            System.out.println(e);
            
        }
    }
}
