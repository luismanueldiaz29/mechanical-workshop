package Loguica;

//Importamos la siguiente clase para poder trabajar con fecha tipo GregorianCalendar

import java.util.GregorianCalendar;
import java.util.logging.Logger;

/**
 * Clase que representa los partes de reparacion que son creados cada vez que un
 * cliente lleva un vehiculo a reparar al taller.
 *
 * @author German Martinez Maldonado
 * @version 1.0, 22/02/10
 */
public class ParteReparacion {

    private String Propietario;
    private String Cedula;
    private String matricula;
    private String modelo;
    private String tipo;
    //El valor del booleano sera "true" cuando el vehiculo se encuentre en reparacion y "false" cuando no.
    private String Empleado;
    private String enReparacion;
    private String horasEstimadas;
    private String Total;

    public ParteReparacion() {
    }

    public ParteReparacion(String Propietario, String Cedula, String matricula, String modelo, String tipo,
            String Empleado, String enReparacion, String horasEstimadas) {
        this.Propietario = Propietario;
        this.Cedula = Cedula;
        this.matricula = matricula;
        this.modelo = modelo;
        this.tipo = tipo;
        this.Empleado = Empleado;
        this.enReparacion = enReparacion;
        this.horasEstimadas = horasEstimadas;
    }

    public String getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(String Empleado) {
        this.Empleado = Empleado;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEnReparacion() {
        return enReparacion;
    }

    public void setEnReparacion(String enReparacion) {
        this.enReparacion = enReparacion;
    }

    public String getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(String horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    

 
}