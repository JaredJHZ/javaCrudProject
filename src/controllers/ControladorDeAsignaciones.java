/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.ControladorDeProyectos.getDateOfLocalDate;
import static controllers.ControladorDeProyectos.getDateOfSql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.Asignaciones;
import models.Proyectos;

/**
 *
 * @author jared.hernandez
 */
public class ControladorDeAsignaciones {
    
   private static boolean baseDeDatosConectada;
  
    
   private static void prenderBD( ) {
        baseDeDatosConectada = BaseDeDatos.getDataBaseInstance() != null; 
   }
   
    public static void postAsignacion(Asignaciones asignacion) {
       prenderBD();
       String id = "";
       if (baseDeDatosConectada) {
           String sqlQuery = "INSERT INTO asignaciones(idProyecto,idEmpleado, horasAsignadas, calificacion) "
                   + " VALUES (?,?,?,?)";
           try (PreparedStatement statement =  BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)){
               statement.setString(1, asignacion.getIdProyecto());
               statement.setString(2, asignacion.getIdEmpleado());
               statement.setInt(3, asignacion.getHorasAsignadas());
               statement.setInt(4, asignacion.getCalificacion());
               if (statement.executeUpdate() > 0) {
                   System.out.println("Insertado a la base de datos");
               }
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
       }
    }
    
       public static Asignaciones getAsignacionesByIdOfEmpleado(String id) {
       prenderBD();
       Asignaciones asignacion = new Asignaciones();
       
       if (baseDeDatosConectada) {
           String sqlQuery = "SELECT * FROM asignaciones WHERE idEmpleado = ?";
           try (PreparedStatement statement = BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)) {
               statement.setString(1, id);
               ResultSet rs = statement.executeQuery();
               while(rs.next()) {
                   asignacion.setIdProyecto(rs.getString("idProyecto"));
                   asignacion.setIdEmpleado(rs.getString("idEmpleado"));
                   asignacion.setHorasAsignadas(rs.getInt("horasAsignadas"));
                   asignacion.setCalificacion(rs.getInt("calificacion"));
               }
           }catch(SQLException ex) {
               System.out.println(ex.getMessage());
           }
       }
       
       return asignacion;
   }
       
     public static void borrarProyectoById(String idEmpleado, String idProyecto) {
       prenderBD();
       if (baseDeDatosConectada) {
           String sqlQuery = "DELETE FROM asignaciones WHERE idEmpleado = ? AND idProyecto = ?";
           try(PreparedStatement statement = BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)) {
                statement.setString(1, idEmpleado);
                statement.setString(2, idProyecto);
                if (statement.executeUpdate() > 0) {
                   System.out.println("Borrado de la base de datos");
               }
           }catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
           
       }
   }
     
    public static void actualizarAsignacion(Asignaciones asignacion) {
       prenderBD();
       if (baseDeDatosConectada) {
           String sqlQuery = "UPDATE asignaciones set horasAsignadas = ?, calificacion = ?"
                   + " WHERE idEmpleado = ? AND idProyecto = ? ";
           try (PreparedStatement statement = BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)){
               statement.setInt(1, asignacion.getHorasAsignadas());
               statement.setInt(2, asignacion.getCalificacion());
               statement.setString(3,asignacion.getIdEmpleado());
               statement.setString(4, asignacion.getIdProyecto());
               System.out.println("xd");
               System.out.println(statement.toString());
               if (statement.executeUpdate() > 0) {
                    System.out.println("Datos actualizados");
               }
           }catch (SQLException ex) {
               System.out.println(ex.getMessage());
           } 
       }
   }
       
       
}
