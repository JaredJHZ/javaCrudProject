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
    public static Connection conn;
    
    public static boolean connectDB() {
        
        try {            
          conn = DriverManager.getConnection(url, user, password);
          System.out.println("Base de datos conectada");
        } catch (SQLException e) {
           System.out.println(e.getMessage());
           return false;
        }
        return true;
    }
    
    
    public static void turnOffDB() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
