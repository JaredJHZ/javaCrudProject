/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import models.Trabajadores;

/**
 *
 * @author jared.hernandez
 */
public class ControladorDeTrabajadores {
       private static boolean baseDeDatosConectada;
  
    
   private static void prenderBD( ) {
        if (BaseDeDatos.connectDB()){
            baseDeDatosConectada = true;
        } else {
            baseDeDatosConectada = false;
        }
   }
   
   public static Date getDateOfLocalDate(LocalDate date) {
       java.sql.Date sqlDate = java.sql.Date.valueOf( date );
       return sqlDate;
   }
   public static LocalDate getDateOfSql(Date date) {
       return date.toLocalDate();
   }
    
   public static void postTrabajador(Trabajadores trabajador) {
       prenderBD();
       String id = "";
       if (baseDeDatosConectada) {
           String sqlQuery = "INSERT INTO trabajadores(idEmpleado,idDepto, nombre, apellidoPaterno, "
                   + "apellidoMaterno, fechaDeNacimiento, fechaDeContratacion,salario)"
                   + " VALUES (?,?,?,?,?,?,?,?)";
           try (PreparedStatement statement =  BaseDeDatos.conn.prepareStatement(sqlQuery)){
               statement.setString(1, trabajador.getIdEmpleado() );
               statement.setString(2, trabajador.getIdDepartamento());
               statement.setString(3, trabajador.getNombre());
               statement.setString(4, trabajador.getApellidoPaterno());
               statement.setString(5, trabajador.getApellidoMaterno());
               statement.setDate(6, getDateOfLocalDate(trabajador.getFechaDeNacimiento()));
               statement.setDate(7, getDateOfLocalDate(trabajador.getFechaDeContratacion()));
               statement.setDouble(8, trabajador.getSalario());
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
   

   public static Trabajadores getTrabajadoresById(String id) {
       prenderBD();
       Trabajadores trabajadorADevolver = new Trabajadores();
       
       if (baseDeDatosConectada) {
           String sqlQuery = "SELECT * FROM trabajadores WHERE idEmpleado = ?";
           try (PreparedStatement statement = BaseDeDatos.conn.prepareStatement(sqlQuery)) {
               statement.setString(1, id);
               ResultSet rs = statement.executeQuery();
               while(rs.next()) {
                   trabajadorADevolver.setIdDepartamento(rs.getString("idDepto"));
                   trabajadorADevolver.setNombre(rs.getString("nombre"));
                   trabajadorADevolver.setApellidoPaterno(rs.getString("apellidoPaterno"));
                   trabajadorADevolver.setApellidoMaterno(rs.getString("apellidoMaterno"));
                   trabajadorADevolver.setSalario(rs.getDouble("salario"));
                   trabajadorADevolver.setFechaDeContratacion(getDateOfSql(rs.getDate("fechaDeContratacion")));
                   trabajadorADevolver.setFechaDeNacimiento(getDateOfSql(rs.getDate("fechaDeNacimiento")));
               }
           }catch(SQLException ex) {
               System.out.println(ex.getMessage());
           } finally {
               BaseDeDatos.turnOffDB();
           }
       }
       
       return trabajadorADevolver;
   }
   
   public static void borrarTrabajadorById(String id) {
       prenderBD();
       if (baseDeDatosConectada) {
           String sqlQuery = "DELETE FROM trabajadores WHERE idEmpleado = ?";
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
   
   public static void actualizarTrabajador(Trabajadores trabajador) {
       prenderBD();
       if (baseDeDatosConectada) {
           String sqlQuery = "UPDATE trabajadores set idDepto = ?, nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?, "
                   + "fechaDeNacimiento = ?, fechaDeContratacion = ?, salario = ? WHERE idDepto = ? ";
           try (PreparedStatement statement = BaseDeDatos.conn.prepareStatement(sqlQuery)){
               statement.setString(1, trabajador.getIdDepartamento());
               statement.setString(2, trabajador.getNombre());
               statement.setString(3, trabajador.getApellidoPaterno());
               statement.setString(4, trabajador.getApellidoMaterno());
               statement.setDate(5, getDateOfLocalDate(trabajador.getFechaDeNacimiento()));
               statement.setDate(6, getDateOfLocalDate(trabajador.getFechaDeContratacion()));
               statement.setDouble(7, trabajador.getSalario());
               statement.setString(8, trabajador.getIdEmpleado());
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
