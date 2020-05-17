/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controllers.BaseDeDatos;
import controllers.ControladorDeAsignaciones;
import controllers.ControladorDeProyectos;
import controllers.ControladorDeTrabajadores;
import controllers.ControladorDepartamentos;
import java.time.Month;
import java.util.Date;
import controllers.ControladorJefesDeDepartamento;
import java.time.LocalDate;
import models.Asignaciones;
import models.Departamentos;
import models.JefesDelDepartamento;
import models.Proyectos;
import models.Trabajadores;

/**
 *
 * @author jared.hernandez
 */
public class Main {
    public static void main(String args[]) {
        

        //System.out.println(BaseDeDatos.getDataBaseInstance());
        //System.out.println(BaseDeDatos.getDataBaseInstance());
        
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
       
       //Trabajadores trabajador = new Trabajadores();
       
       //trabajador.setIdEmpleado("00000002");
       //trabajador.setIdDepartamento("00000001");
       //trabajador.setNombre("Jared");
       //trabajador.setApellidoPaterno("H");
       //trabajador.setApellidoMaterno("Z");
       //trabajador.setFechaDeNacimiento(LocalDate.of(1997, Month.JUNE, 25));
       //trabajador.setFechaDeContratacion(LocalDate.now());
       //trabajador.setSalario(5500);
       
       //ControladorDeTrabajadores.postTrabajador(trabajador);
       
       //ControladorDeTrabajadores.actualizarTrabajador(trabajador);
       
       //trabajador = ControladorDeTrabajadores.getTrabajadoresById("00000001");
       //System.out.println(trabajador.getApellidoPaterno());
       //System.out.println(trabajador.getApellidoMaterno());
       //System.out.println(trabajador.getNombre());
       
       //ControladorDeTrabajadores.borrarTrabajadorById("00000001");
       
       
       
       // -- JEFES DEL DEPARTAMENTO --
       
       //JefesDelDepartamento jefe = new JefesDelDepartamento();
       
       //jefe.setIdJefe("00000001");
       //jefe.setIdDepto("00000001");
       //jefe.setIdEmpleado("00000002");
       
       //ControladorJefesDeDepartamento.postJefeDelDepartamento(jefe);
       
       //ControladorJefesDeDepartamento.actualizarJefeDeDepartamento(jefe);
       
       //ControladorJefesDeDepartamento.postJefeDelDepartamento(jefe
       
       //jefe = ControladorJefesDeDepartamento.getJefesDeDepartamentoById("00000001");
       
        //System.out.println(jefe.getIdDepto());
        
       //ControladorJefesDeDepartamento.borrarJefeDeDepartamentoById("00000001");
       
       // --PROYECTOS --
       
       //Proyectos proyectoUno = new Proyectos();
       
       //proyectoUno.setIdProyecto("00000001");
       //proyectoUno.setIdJefe("00000001");
       //proyectoUno.setNombreProyecto("Web Page");
       //proyectoUno.setPresupuesto(30000);
       //proyectoUno.setFechaDeInicio(LocalDate.now());
       //proyectoUno.setDuracionDeSemanasEsperadas(3);
       //ControladorDeProyectos.postProyectos(proyectoUno);
       //ControladorDeProyectos.borrarProyectoById("00000001");
       //ControladorDeProyectos.actualizarTrabajador(proyectoUno);
       
       // -- Asignaciones --
       
       //Asignaciones asignacion = new Asignaciones();
       
       //asignacion.setIdEmpleado("00000001");
       //asignacion.setIdProyecto("00000001");
       //asignacion.setHorasAsignadas(5);
       //asignacion.setCalificacion(10);
       
        //asignacion = ControladorDeAsignaciones.getAsignacionesByIdOfEmpleado("00000001");
        
        //System.out.println(asignacion.getCalificacion());
         //ControladorDeAsignaciones.actualizarAsignacion(asignacion);
        
       //ControladorDeAsignaciones.borrarProyectoById("00000001", "00000001");
    }
}
