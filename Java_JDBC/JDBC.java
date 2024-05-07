import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.sql.jdbc.driver");
        } catch (ClassNotFoundException cne) {
            System.out.println(cne);
        }
        String url = "jdbc:mysql://localhost:3306/Student";
        String user = "root";
        String password = "MDasifnawaz@545";
        String query1 = "select * from thirdyear;";
        String query2 = "INSERT into thirdyear(id,name,section,cgpa) VALUES (22052741,'MOHAMMAD NASAR AHMDAD','CSE09',9.0);";
        String query3 = "DELETE FROM thirdyear WHERE id=22052741;";
        String query4 = "UPDATE thirdyear set name='MOHAMMAD NASAR AHMAD' WHERE id=22052741;";
        String query5 = "ALTER TABLE thirdyear DROP CONSTRAINT nn;";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected with the Database");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query1);

//            Database Query No. 1

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String section = rs.getString("section");
                double cgpa = rs.getDouble("cgpa");
                System.out.println("Roll No - " + id);
                System.out.println("Name - " + name);
                System.out.println("Section - " + section);
                System.out.println("CGPA - " + cgpa);
                System.out.println("================================");
            }

//            Database Query No. 2

            int rowsaffected = stm.executeUpdate(query5);
            if (rowsaffected > 0)
                System.out.println("Data Inserted Successfully and " + rowsaffected + " rows(s) are affected.");
            if (rowsaffected > 0)
                System.out.println("Data Deleted Successfully and " + rowsaffected + " rows(s) are affected.");
            if (rowsaffected > 0)
                System.out.println("Data Updated Successfully and " + rowsaffected + " rows(s) are affected.");


            else System.out.println("Data Not Inserted.");

//            Database Query No. 2


            rs.close();
            stm.close();
            con.close();
            System.out.println("Connection Closed Successfully.");
        } catch (SQLException se) {
            System.out.println("Not Connected with the Database" + se);
        }

    }
}
