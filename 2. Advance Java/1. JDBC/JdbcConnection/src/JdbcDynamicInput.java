import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDynamicInput {

    public static void main(String args[]) throws SQLException {
        Scanner in = new Scanner(System.in);
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "darshan@123");

            if (con.isClosed()) {
                System.out.println("Connection is Closed !!!");
                return;
            } else {
                System.out.println("Successfully Connected to Database !!!");
            }

            String insertInto = "INSERT INTO student(student_id,student_name,phone_no) VALUES(?,?,?);";

            System.out.println("Ensert Data In Student Table: ");

            while (true) {
                System.out.print("Enter Student Name : ");
                String student_name = in.nextLine();
                System.out.print("Enter Phone No : ");
                String phone_no = in.nextLine();
                System.out.print("Enter Student ID : ");
                int student_id = in.nextInt();

                PreparedStatement pstmt = con.prepareStatement(insertInto);
                pstmt.setInt(1, student_id);
                pstmt.setString(2, student_name);
                pstmt.setString(3, phone_no);

                pstmt.executeUpdate();
                System.out.print("Do you want to enter new Student [y/n] : ");
                char c = in.next().charAt(0);
                if (c == 'n') {
                    break;
                } else {
                    continue;
                }
            }

            System.out.println("Successfully Inserted data in table!!!!");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        in.close();
    }

}
