/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author nelcy
 */
public class T_Universidades {

    public int Id;
    public int IdUniversidad;
    public String Nombre;
    public String Estatus;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdUniversidad() {
        return IdUniversidad;
    }

    public void setIdUniversidad(int IdUniversidad) {
        this.IdUniversidad = IdUniversidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

}
