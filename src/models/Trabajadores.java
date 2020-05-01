/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author abraham.ramit
 */
public class Trabajadores {
    String idEmpleado;
    String idDepto;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    LocalDate fechaDeNacimiento;
    LocalDate fechaDeContratacion;
    double salario;

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getIdDepartamento() {
        return idDepto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public LocalDate getFechaDeContratacion() {
        return fechaDeContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepto = idDepartamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setFechaDeContratacion(LocalDate fechaDeContratacion) {
        this.fechaDeContratacion = fechaDeContratacion;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
