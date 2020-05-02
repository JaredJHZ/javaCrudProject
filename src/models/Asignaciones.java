/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author jared.hernandez
 */
public class Asignaciones {
    
    private String idProyecto;
    private String idEmpleado;
    private int HorasAsignadas;
    private int Calificacion;

    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getHorasAsignadas() {
        return HorasAsignadas;
    }

    public void setHorasAsignadas(int HorasAsignadas) {
        this.HorasAsignadas = HorasAsignadas;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }
    
    
    
}
