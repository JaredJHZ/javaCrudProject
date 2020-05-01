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
        if (BaseDeDatos.connectDB()){
            baseDeDatosConectada = true;
        } else {
            baseDeDatosConectada = false;
        }
   }
    
   public static void postDepartamentos(Departamentos departamento) {
       prenderBD();
       String id = "";
       if (baseDeDatosConectada) {
           String sqlQuery = "INSERT INTO Departamentos(idDepto, nombreDeDepartamento) VALUES (?, ?)";
           try (PreparedStatement statement =  BaseDeDatos.conn.prepareStatement(sqlQuery)){
               statement.setString(1, departamento.getIdDepartamento() );
               statement.setString(2, departamento.getNombreDelDepartamento());
               if (statement.executeUpdate() > 0) {
                   System.out.println("Insertado a la base de datos");
               }
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           } finally {
               BaseDeDatos.turnOffDB();
           }
       }
    }
   
   
   public static Departamentos getDepartamentoById(String id) {
       prenderBD();
       Departamentos departamentoADevolver = new Departamentos();
       
       if (baseDeDatosConectada) {
           String sqlQuery = "SELECT * FROM departamentos WHERE idDepto = ?";
           try (PreparedStatement statement = BaseDeDatos.conn.prepareStatement(sqlQuery)) {
               statement.setString(1, id);
               ResultSet rs = statement.executeQuery();
               while(rs.next()) {
                   departamentoADevolver.setIdDepartamento(rs.getString("idDepto"));
                   departamentoADevolver.setNombreDelDepartamento(rs.getString("nombreDeDepartamento"));
               }
           }catch(SQLException ex) {
               System.out.println(ex.getMessage());
           } finally {
               BaseDeDatos.turnOffDB();
           }
       }
       
       return departamentoADevolver;
   }
   
   public static void borrarDepartamentoById(String id) {
       prenderBD();
       if (baseDeDatosConectada) {
           String sqlQuery = "DELETE FROM departamentos WHERE idDepto = ?";
           try(PreparedStatement statement = BaseDeDatos.conn.prepareStatement(sqlQuery)) {
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
   
   public static void actualizarDepartamento(Departamentos departamento) {
       prenderBD();
       if (baseDeDatosConectada) {
           String sqlQuery = "UPDATE departamentos set nombreDeDepartamento = ? WHERE idDepto = ? ";
           try (PreparedStatement statement = BaseDeDatos.conn.prepareStatement(sqlQuery)){
               statement.setString(1, departamento.getNombreDelDepartamento());
               statement.setString(2, departamento.getIdDepartamento());
               if (statement.executeUpdate() > 0) {
                    System.out.println("Datos actualizados");
               }
           }catch (SQLException ex) {
               System.out.println(ex.getMessage());
           } finally {
               BaseDeDatos.turnOffDB();
           }
       }
   }
    
}
