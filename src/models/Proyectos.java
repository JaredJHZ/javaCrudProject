/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author jared.hernandez
 */
public class Proyectos {
    private String idProyecto;
    private String nombreProyecto;
    private String idJefe;
    private double presupuesto;
    private LocalDate fechaDeInicio;
    private int duracionDeSemanasEsperadas;

    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(String idJefe) {
        this.idJefe = idJefe;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public int getDuracionDeSemanasEsperadas() {
        return duracionDeSemanasEsperadas;
    }

    public void setDuracionDeSemanasEsperadas(int duracionDeSemanasEsperadas) {
        this.duracionDeSemanasEsperadas = duracionDeSemanasEsperadas;
    }
    
    
}
