import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
       Class.forName("oracle.jdbc.driver.OracleDriver");

       try
       {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcld","darshan", "darshan123");

            Statement stmt = con.createStatement();

            // String createTable = "CREATE TABLE TEACHER(teacher_id NUMBER,teacher_name VARCHAR(255),phone_no VARCHAR(10))";

            // stmt.executeUpdate(createTable);

            // System.out.println("Table Created Successfully!!!");

            // String insertInto = "INSERT INTO teacher(teacher_id,teacher_name,phone_no) VALUES(?,?,?)";

            // PreparedStatement pstmt = con.prepareStatement(insertInto);
            // pstmt.setInt(1, 2);
            // pstmt.setString(2,"Prasad Khairnar");
            // pstmt.setString(3,"7249729049");

            // pstmt.executeUpdate();

            String s = "select * from teacher";

            ResultSet set = stmt.executeQuery(s);

            while(set.next())
            {
                String name = set.getString(1);
                String address = set.getString(2);

                System.out.println(name + " " + address);
            }

       }
       catch(Exception ex)
       {
            ex.printStackTrace();
       }
    }
}
