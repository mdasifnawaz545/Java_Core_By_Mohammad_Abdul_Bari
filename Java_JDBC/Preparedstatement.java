import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Preparedstatement {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "MDasifnawaz@545";
        String query1 = "SELECT * FROM thirdyear WHERE id = ?;";
        String query2 = "INSERT INTO thirdyear(id,name,section,cgpa) VALUES (?,?,?,?);";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully.");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Driver not Loaded - "+cnfe);
        }
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected with the Database");

                PreparedStatement ps = con.prepareStatement(query2);
                System.out.println("Enter Roll - ");
                int id = scn.nextInt();
                System.out.println("Enter Name - ");
                String name = scn.nextLine();
                System.out.println("Enter Section - ");
                String section = scn.nextLine();
                System.out.println("Enter CGPA - ");
                double cgpa = scn.nextDouble();
//            System.out.println("Roll - " + rst.getInt("id"));
//            System.out.println("Name - " + rst.getString("name"));
//            System.out.println("Section- " + rst.getString("section"));
//            System.out.println("CGPA - " + rst.getDouble("cgpa"));
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, section);
                ps.setDouble(4, cgpa);
                int rowsAffected = ps.executeUpdate();
//            while(rst.next()){
//                System.out.println("Roll - " + rst.getInt("id"));
//                System.out.println("Name - " + rst.getString("name"));
//                System.out.println("Section- " + rst.getString("section"));
//                System.out.println("CGPA - " + rst.getDouble("cgpa"));
//            }
                if (rowsAffected > 0) {
                    System.out.println("Succesfully");
                }
//            rst.close();
                ps.close();
//
            con.close();
        } catch (SQLException se) {
            System.out.println(se);
        }

    }
}
