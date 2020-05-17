
package controllers;

import controllers.BaseDeDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.JefesDelDepartamento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jared.hernandez
 */
public class ControladorJefesDeDepartamento {
   
   private static boolean baseDeDatosConectada;
      
   private static void prenderBD( ) {
       baseDeDatosConectada = BaseDeDatos.getDataBaseInstance() != null; 
   }
   
      public static void postJefeDelDepartamento(JefesDelDepartamento jefe) {
       prenderBD();
       String id = "";
       if (baseDeDatosConectada) {
           String sqlQuery = "INSERT INTO jefe_de_departamentos(idEmpleado, idDepto, idJefe) VALUES (?, ?, ?)";
           try (PreparedStatement statement =  BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)){
               statement.setString(1, jefe.getIdJefe() );
               statement.setString(2, jefe.getIdDepto() );
               statement.setString(3, jefe.getIdJefe());
               if (statement.executeUpdate() > 0) {
                   System.out.println("Insertado a la base de datos");
               }
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
       }
    }
      
      public static JefesDelDepartamento getJefesDeDepartamentoById(String id) {
       prenderBD();
       JefesDelDepartamento jefe = new JefesDelDepartamento();
       
       if (baseDeDatosConectada) {
           String sqlQuery = "SELECT * FROM jefe_de_departamentos WHERE idJefe = ?";
           try (PreparedStatement statement = BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)) {
               statement.setString(1, id);
               ResultSet rs = statement.executeQuery();
               while(rs.next()) {
                   jefe.setIdJefe(rs.getString("idJefe"));
                   jefe.setIdDepto(rs.getString("idDepto"));
                   jefe.setIdEmpleado(rs.getString("idEmpleado"));
               }
           }catch(SQLException ex) {
               System.out.println(ex.getMessage());
           }
       }
       
       return jefe;
   }
      
       public static void borrarJefeDeDepartamentoById(String id) {
       prenderBD();
       if (baseDeDatosConectada) {
           String sqlQuery = "DELETE FROM jefe_de_departamentos WHERE idEmpleado = ?";
           try(PreparedStatement statement = BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)) {
                statement.setString(1, id);
                if (statement.executeUpdate() > 0) {
                   System.out.println("Borrado de la base de datos");
               }
           }catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }finally {
               BaseDeDatos.turnOffDB();
           }
           
       }
   }
       
     public static void actualizarJefeDeDepartamento(JefesDelDepartamento jefe) {
       prenderBD();
       if (baseDeDatosConectada) {
           String sqlQuery = "UPDATE jefe_de_departamentos set idEmpleado = ? WHERE idJefe = ? ";
           try (PreparedStatement statement = BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)){
               statement.setString(1, jefe.getIdEmpleado());
               statement.setString(2, jefe.getIdJefe());
               if (statement.executeUpdate() > 0) {
                    System.out.println("Datos actualizados");
               }
           }catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
       }
   }
   
    
}
