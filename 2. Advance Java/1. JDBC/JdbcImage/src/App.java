import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
// import java.sql.Statement;

import javax.swing.JFileChooser;

public class App {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root","darshan@123");

            // Statement stmt = con.createStatement();

            // String createTable = "CREATE TABLE images(image_id int(10),image_data longblob);";

            // stmt.executeUpdate(createTable);

            // System.out.println("Table Created Successfully");


            String insertInto = "Insert into images(image_id,image_data) values(?,?);";

            PreparedStatement pstmt = con.prepareStatement(insertInto);

            JFileChooser jch = new JFileChooser();

            jch.showOpenDialog(null);

            File f = jch.getSelectedFile();

            FileInputStream fis = new FileInputStream(f);

            pstmt.setInt(1, 4);
            pstmt.setBinaryStream(2, fis,fis.available());

            pstmt.executeUpdate();

            System.out.println("Image Saved Successfully!!!");

            // con.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
