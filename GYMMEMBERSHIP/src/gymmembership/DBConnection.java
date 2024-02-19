/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmembership;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class DBConnection {
     static final String DB_URL="jdbc:mysql://localhost/gymmembership";
  static final String USER="root";
  static final String PASS="";
  
  public static Connection DBConnection(){
Connection con= null;
      try {
          con=DriverManager.getConnection(DB_URL,USER,PASS);
          return con;
      } catch (SQLException ex) {
          System.out.println("ERROR WHILE CONNECTING");
          return null;
      }
      }
}
