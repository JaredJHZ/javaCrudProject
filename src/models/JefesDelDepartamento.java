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
public class JefesDelDepartamento {
    private String idEmpleado;
    private String idDepto;
    private String idJefe;

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    public String getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(String idJefe) {
        this.idJefe = idJefe;
    }

    public String getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(String idDepto) {
        this.idDepto = idDepto;
    }
}
