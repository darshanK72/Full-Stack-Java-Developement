import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

    public static void main(String args[]) throws SQLException
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root","darshan@123");

            if(con.isClosed())
            {
                System.out.println("Connection is Closed !!!");
                return;
            }
            else
            {
                System.out.println("Successfully Connected to Database !!!");
            }

            Statement stmt = con.createStatement();

            String createTable = "CREATE TABLE student(student_id INT(20),student_name VARCHAR(255),phone_no VARCHAR(10))";

            stmt.executeUpdate(createTable);

            System.out.println("Table Created Successfully!!!");

            String insertInto = "INSERT INTO student(student_id,student_name,phone_no) VALUES(?,?,?);";

            PreparedStatement pstmt = con.prepareStatement(insertInto);
            pstmt.setInt(1, 1);
            pstmt.setString(2,"Darshan Khairnar");
            pstmt.setString(3,"9834444657");

            pstmt.executeUpdate();

            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
