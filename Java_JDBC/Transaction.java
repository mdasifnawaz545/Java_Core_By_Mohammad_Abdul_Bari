import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transaction {
    public static void main(String args[]) {
        String query = "INSERT INTO thirdyear (id,name,section,cgpa) VALUES (?,?,?,?);";
        Scanner scn = new Scanner(System.in);
        int choice;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Driver Not Found");
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "MDasifnawaz@545");
            System.out.println("Connected with the Database");
            con.setAutoCommit(false);
            System.out.println("Enter the Number of Data You want to insert");
            choice = scn.nextInt();
            int id;
            String name;
            String section;
            double cgpa;
            try {
                PreparedStatement ps = con.prepareStatement(query);
                for (int i = 0; i < choice; i++) {
                    System.out.println("Enter Name - ");
                    name = scn.nextLine();
                    scn.nextLine();
                    System.out.println("Enter Section - ");
                    section = scn.nextLine();
                    System.out.println("Enter Roll - ");
                    id = scn.nextInt();
                    System.out.println("Enter CGPA - ");
                    cgpa = scn.nextDouble();
                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setString(3, section);
                    ps.setDouble(4, cgpa);
                    ps.addBatch();
                }
                int rows[] = ps.executeBatch();
                con.commit();
                System.out.println("Data Inserted Successfully using Batch Processing");
            } catch (SQLException sqe) {
                con.rollback();
                System.out.println(sqe);
            }

        } catch (SQLException se) {
            System.out.println(se);
        }
    }
}
