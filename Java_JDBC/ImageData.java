import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class ImageData {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/Student";
        String user = "root";
        String pass = "MDasifnawaz@545";
        String query = "INSERT INTO image_data (img_path) VALUES (?)";
        String query1 = "SELECT img_path FROM image_data where img_id = ?";
        String image_path = "C:\\Users\\KIIT\\OneDrive\\Desktop\\New folder (2)\\DSC_1698.jpg";
        String folder_path="D:\\New folder (2)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Driver Not Loaded - " + cnfe);
        }
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected With the Database");
            PreparedStatement ps = con.prepareStatement(query1);
            System.out.println("Enter the Image Id to Retrive the data");
            int id = scn.nextInt();
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            int count=0;
            while(rs.next()){
                byte img_data[]=rs.getBytes("img_path");
                String image_p=folder_path+"new"+(count++);
                FileOutputStream fos=new FileOutputStream(image_p);
                fos.write(img_data);

            }


//            FileInputStream fis=new FileInputStream(image_path);
//            byte b[]=new byte[fis.available()];
//            fis.read(b);
//            ps.setBytes(1,b);
//            int rowaffected = ps.executeUpdate();
//            if(rowaffected>0) System.out.println("Image Inserted Successfully");
//            else System.out.println("Not Inserted");
        } catch (SQLException se) {
            System.out.println(se);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
