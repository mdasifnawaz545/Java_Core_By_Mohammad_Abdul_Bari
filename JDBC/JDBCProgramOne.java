package JDBC;

import java.beans.Statement;
import java.sql.*;


public class JDBCProgramOne {
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch(Exception cnfe){
            System.out.println("Class is not Found");
        }
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/college?");
            System.out.println("Connected with the MySQL Database");
            Statement stm=(Statement) con.createStatement();
           

        }catch(SQLException sqle){
            System.out.println("Error in Connecting with the Database");
        }
        
        
    }
    
}
