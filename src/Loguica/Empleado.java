/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loguica;

/**
 *
 * @author acer pc
 */
public class Empleado extends Cliente{
    private String especialidad;

    public Empleado() {
    }
    
    
    public Empleado(String apellidos, String nombre, String direccion, String dni, String especialidad) {
        super(apellidos, nombre, direccion, dni);
        this.especialidad = especialidad; 
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
}
