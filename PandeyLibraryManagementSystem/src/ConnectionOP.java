/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author tanma
 */
public class ConnectionOP {
    static Connection con =null;
    
    public static Connection getConnection()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tanmay_librarymanagementsystem","root","253097");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
        }
    }

