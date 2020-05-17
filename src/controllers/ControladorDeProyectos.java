/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.ControladorDeTrabajadores.getDateOfLocalDate;
import static controllers.ControladorDeTrabajadores.getDateOfSql;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import models.Proyectos;

/**
 *
 * @author jared.hernandez
 */
public class ControladorDeProyectos {
   
    private static boolean baseDeDatosConectada;
  
    
   private static void prenderBD( ) {
       baseDeDatosConectada = BaseDeDatos.getDataBaseInstance() != null; 
   }
   
   public static Date getDateOfLocalDate(LocalDate date) {
       java.sql.Date sqlDate = java.sql.Date.valueOf( date );
       return sqlDate;
   }
   public static LocalDate getDateOfSql(Date date) {
       return date.toLocalDate();
   }
   
      
   public static void postProyectos(Proyectos proyecto) {
       prenderBD();
       String id = "";
       if (baseDeDatosConectada) {
           String sqlQuery = "INSERT INTO proyectos(idProyecto,idJefe, nombreProyecto, presupuesto, fechaDeInicio "
                   + ",duracionDeSemanasEsperadas )"
                   + " VALUES (?,?,?,?,?,?)";
           try (PreparedStatement statement =  BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)){
               statement.setString(1, proyecto.getIdProyecto());
               statement.setString(2, proyecto.getIdJefe());
               statement.setString(3, proyecto.getNombreProyecto());
               statement.setDouble(4, proyecto.getPresupuesto());
               statement.setDate(5,getDateOfLocalDate(proyecto.getFechaDeInicio()));
               statement.setInt(6,proyecto.getDuracionDeSemanasEsperadas());
               if (statement.executeUpdate() > 0) {
                   System.out.println("Insertado a la base de datos");
               }
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
       }
    }
   
   public static Proyectos getProyectoById(String id) {
       prenderBD();
       Proyectos proyecto = new Proyectos();
       
       if (baseDeDatosConectada) {
           String sqlQuery = "SELECT * FROM proyectos WHERE idProyecto = ?";
           try (PreparedStatement statement = BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)) {
               statement.setString(1, id);
               ResultSet rs = statement.executeQuery();
               while(rs.next()) {
                   proyecto.setIdProyecto(rs.getString("idProyecto"));
                   proyecto.setIdJefe(rs.getString("idJefe"));
                   proyecto.setNombreProyecto(rs.getString("nombreProyecto"));
                   proyecto.setDuracionDeSemanasEsperadas(rs.getInt("duracionDeSemanas"));
                   proyecto.setPresupuesto(rs.getDouble("presupuesto"));
                   proyecto.setFechaDeInicio(getDateOfSql(rs.getDate("fechaDeInicio")));
               }
           }catch(SQLException ex) {
               System.out.println(ex.getMessage());
           } 
       }
       
       return proyecto;
   }
   
      
   public static void borrarProyectoById(String id) {
       prenderBD();
       if (baseDeDatosConectada) {
           String sqlQuery = "DELETE FROM proyectos WHERE idProyecto = ?";
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
   
    public static void actualizarTrabajador(Proyectos proyecto) {
       prenderBD();
       if (baseDeDatosConectada) {
           String sqlQuery = "UPDATE proyectos set idJefe = ?, nombreProyecto = ?, presupuesto = ?, "
                   + "fechaDeInicio = ?, duracionDeSemanasEsperadas = ? WHERE idProyecto = ? ";
           try (PreparedStatement statement = BaseDeDatos.getDataBaseInstance().prepareStatement(sqlQuery)){
               statement.setString(1, proyecto.getIdJefe());
               statement.setString(2, proyecto.getNombreProyecto());
               statement.setDouble(3, proyecto.getPresupuesto());
               statement.setDate(4, getDateOfLocalDate(proyecto.getFechaDeInicio()));
               statement.setInt(5, proyecto.getDuracionDeSemanasEsperadas());
               statement.setString(6, proyecto.getIdProyecto());
               if (statement.executeUpdate() > 0) {
                    System.out.println("Datos actualizados");
               }
           }catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
       }
   }
   
}
