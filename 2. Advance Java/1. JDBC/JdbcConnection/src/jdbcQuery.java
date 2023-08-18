import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcQuery {
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

            String selectStatement = "select * from persons;";

            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(selectStatement);

            while(set.next())
            {
                int id = set.getInt(1);
                String firstName = set.getString(2);
                String lastName = set.getString(3);
                String city = set.getString(4);

                System.out.println("Name : " + firstName + " " +  lastName);
                System.out.println("ID : " + id);
                System.out.println("City : " + city);
                System.out.println("---------------------------------------");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
    
}
