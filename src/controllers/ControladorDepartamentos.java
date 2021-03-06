/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.Departamentos;

/**
 *
 * @author jared.hernandez
 */
public class ControladorDepartamentos {
    
    private static boolean baseDeDatosConectada;
  
    
   private static void prenderBD( ) {
       baseDeDatosConectada = BaseDeDatos.getDataBaseInstance() != null; 
   }
    
   public static String postDepartamentos(Departamentos departamento) {
       prenderBD();
       String id = "";
       if (baseDeDatosConectada) {
           String sqlQuery = "INSERT INTO departamentos(idDepto, nombreDeDepartamento) VALUES (?, ?)";
           try (PreparedStatement statement =  BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)){
               statement.setString(1, departamento.getIdDepartamento() );
               statement.setString(2, departamento.getNombreDelDepartamento());
               if (statement.executeUpdate() > 0) {
                   System.out.println("Insertado a la base de datos");
               }
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
               return "Hubo un error de tipo: "+ex.getMessage();
           } 
       }
       
       return "Se agrego el departamento con ID "+departamento.getIdDepartamento();
    }
   
   
   public static Departamentos getDepartamentoById(String id) {
       prenderBD();
       Departamentos departamentoADevolver = new Departamentos();
       
       if (baseDeDatosConectada) {
           String sqlQuery = "SELECT * FROM departamentos WHERE idDepto = ?";
           try (PreparedStatement statement = BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)) {
               statement.setString(1, id);
               ResultSet rs = statement.executeQuery();
               while(rs.next()) {
                   departamentoADevolver.setIdDepartamento(rs.getString("idDepto"));
                   departamentoADevolver.setNombreDelDepartamento(rs.getString("nombreDeDepartamento"));
               }
           }catch(SQLException ex) {
               System.out.println(ex.getMessage());
           }
       }
       
       return departamentoADevolver;
   }
   
   public static void borrarDepartamentoById(String id) {
       prenderBD();
       if (baseDeDatosConectada) {
           String sqlQuery = "DELETE FROM departamentos WHERE idDepto = ?";
           try(PreparedStatement statement = BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)) {
                statement.setString(1, id);
                if (statement.executeUpdate() > 0) {
                   System.out.println("Borrado de la base de datos");
               }
           }catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
           
       }
   }
   
   public static void actualizarDepartamento(Departamentos departamento) {
       prenderBD();
       if (baseDeDatosConectada) {
           String sqlQuery = "UPDATE departamentos set nombreDeDepartamento = ? WHERE idDepto = ? ";
           try (PreparedStatement statement = BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)){
               statement.setString(1, departamento.getNombreDelDepartamento());
               statement.setString(2, departamento.getIdDepartamento());
               if (statement.executeUpdate() > 0) {
                    System.out.println("Datos actualizados");
               }
           }catch (SQLException ex) {
               System.out.println(ex.getMessage());
           } 
       }
   }
    
}
