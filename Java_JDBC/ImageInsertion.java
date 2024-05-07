import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class ImageInsertion {
    public static void main(String args[]){
        int count=1;
        String query="INSERT INTO image_data (img_path) VALUES (?);";
        String query1="SELECT img_path FROM image_data WHERE img_id = ?;";
        String img_path="E:\\Pictures\\wEEkenD_pIC\\20170423_135004.jpg";
        String folder_path="D:\\SWL\\";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
        }catch(ClassNotFoundException cnfe){
            System.out.println("Driver Not Found");
        }
    try{
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","MDasifnawaz@545");
        System.out.println("Connected with the Database");
        PreparedStatement ps=con.prepareStatement(query1);
        ps.setInt(1,3);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            byte img_data[]=rs.getBytes("img_path");
            String file_path=folder_path+"new"+(count++)+".jpg";
            FileOutputStream fos=new FileOutputStream(file_path);
            fos.write(img_data);
            System.out.println("Image Downloaded Successfully");
        }
//        FileInputStream fis=new FileInputStream(img_path);
//        byte img_byte[]=new byte[fis.available()];
//        fis.read(img_byte);
//        ps.setBytes(1,img_byte);
//        int rowAffected=ps.executeUpdate();
//        if(rowAffected>0) System.out.println("Inserted Successfully");
//        else System.out.println("Not inserted");
        rs.close();
        ps.close();
        con.close();
    }catch (SQLException se){
        System.out.println("Not Connected"+se);
    }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}
