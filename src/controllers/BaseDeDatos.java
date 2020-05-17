/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author jared.hernandez
 */
public class BaseDeDatos {
    private final static String url = "jdbc:postgresql://localhost/buildingprojects";
    private final static String user = "postgres";
    private final static String password = "Atleti123";
    private static Connection conn ;
    
    
    private BaseDeDatos() {

    }
    
    
    public static Connection getDataBaseInstance() {
        if(conn == null) {
         try {            
            conn = DriverManager.getConnection(url, user, password);
          } catch (SQLException e) {
             System.out.println(e.getMessage());
          }
        }
        return conn;
    }
    
    
    public static void turnOffDB() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
