/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author sandesh
 */
public class dboperation {
    public void saveDatatoStudentTable(ArrayList data) throws ParseException{
        dbconnect dbcon = new dbconnect();
        Connection conn = dbcon.connectdatabase();
        
        String SQL = "INSERT into student(first_name , last_name ,add1 , add2,city ,states,zip,home_phone,gender,entry_date,entry_type,from_school,additional_details) "
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(SQL);
            
            ps.setString(1, data.get(0).toString());
            ps.setString(2, data.get(1).toString());
            ps.setString(3, data.get(2).toString());
            ps.setString(4, data.get(3).toString());
            ps.setString(5, data.get(4).toString());
            ps.setString(6, data.get(5).toString());
            ps.setString(7, data.get(6).toString());
            ps.setLong(8, Long.parseLong(data.get(7).toString()));
            ps.setString(9, data.get(8).toString());
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date d =sdf.parse(data.get(9).toString());
            ps.setDate(10, new java.sql.Date(d.getTime()));
            
            ps.setString(11, data.get(10).toString());
            ps.setString(12, data.get(11).toString());
            ps.setString(13, data.get(12).toString());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Saved");
            
            
        } catch (SQLException ex) {
           System.out.println("error:  " + ex.toString());// Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
      // dbconnect.closeConnection();
       
        
    }
    public ResultSet viewdata(){
           dbconnect dbcon = new dbconnect();
           Statement stmt = null;
           ResultSet rs = null;
           Connection conn = dbcon.connectdatabase();
           String SQL ="select * from student";
        try {
            stmt = conn.createStatement();
            rs=stmt.executeQuery(SQL);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(dboperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
       }
    
}
