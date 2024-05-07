import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Hotel {
    public static void main(String args[]){
        String url="jdbc:mysql://localhost:3306/Hotel";
        String user="root";
        String password="MDasifnawaz@545";
        try{
            Class.forName("com.sql.jdbc.driver");
            System.out.println("Driver Loaded Succesfully.");
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe);
        }
        String query1="CREATE TABLE Reservation(reservation_id INT AUTO_INCREMENT PRIMARY KEY,guest_name VARCHAR(255) NOT NULL,room_no INT NOT NULL,contact_number INT NOT NULL, reservation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP);";
        try{
            Connection con= DriverManager.getConnection(url,user,password);
            System.out.println("Connected with the Database.");
            Statement stm=con.createStatement();
            int rowsaffected=stm.executeUpdate(query1);
            System.out.println("Table Not Created");


            stm.close();
            con.close();
        }catch (SQLException se){
            System.out.println(se);
        }
    }
}
