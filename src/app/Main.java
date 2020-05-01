/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controllers.BaseDeDatos;
import controllers.ControladorDeTrabajadores;
import controllers.ControladorDepartamentos;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import models.Departamentos;
import models.Trabajadores;

/**
 *
 * @author jared.hernandez
 */
public class Main {
    public static void main(String args[]) {
        
        //deptos
        
        //Departamentos departamentoAInsertar = new Departamentos();
        //departamentoAInsertar.setIdDepartamento("00000001");
        //departamentoAInsertar.setNombreDelDepartamento("Design");
        //ControladorDepartamentos.postDepartamentos(departamentoAInsertar);
        //Departamentos dep1 = ControladorDepartamentos.getDepartamentoById("00000005");
        //System.out.println(dep1.getIdDepartamento());
        //System.out.println(dep1.getNombreDelDepartamento());
        
        //Delete
        
        //ControladorDepartamentos.borrarDepartamentoById("00000005");
        
        
       //Actualizar
       
       //Departamentos departamentoAActualizar = new Departamentos();
       //departamentoAActualizar.setIdDepartamento("00000001");
       //departamentoAActualizar.setNombreDelDepartamento("Design");
       //ControladorDepartamentos.actualizarDepartamento(departamentoAActualizar);
       
       // -- Tranajadores --
       
       Trabajadores trabajador = new Trabajadores();
       
       trabajador.setIdEmpleado("00000001");
       trabajador.setIdDepartamento("00000001");
       trabajador.setNombre("Abraham");
       trabajador.setApellidoPaterno("Vasconcelos");
       trabajador.setApellidoMaterno("Ruiz");
       trabajador.setFechaDeNacimiento(LocalDate.of(1997, Month.MAY, 15));
       trabajador.setFechaDeContratacion(LocalDate.now());
       trabajador.setSalario(5500);
       
       ControladorDeTrabajadores.actualizarTrabajador(trabajador);
       
       //trabajador = ControladorDeTrabajadores.getTrabajadoresById("00000001");
       //System.out.println(trabajador.getApellidoPaterno());
       //System.out.println(trabajador.getApellidoMaterno());
       //System.out.println(trabajador.getNombre());
       
       //ControladorDeTrabajadores.borrarTrabajadorById("00000001");
       
       
       
    }
}
