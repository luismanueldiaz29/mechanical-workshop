package Loguica;

//Importamos la siguiente clase para poder trabajar con fechas tipo GregorianCalendar

import java.util.GregorianCalendar;

/**
 * Clase que representa los vehiculos que pueden ser reparados en un taller.
 *
 * @author German Martinez Maldonado
 * @version 1.0, 22/02/10
 */
public class Vehiculo {

    //DeclaraciOn de los datos miembros como privados para que no puedan ser modificados directamente desde fuera de la clase.
    private String Propietario;
    private String Cedula;
    private String matricula;
    private String modelo;
    private String tipo;
    private GregorianCalendar fechaCompra;
    //El valor del booleano sera "true" cuando el vehiculo se encuentre en reparacion y "false" cuando no.
    private String enReparacion;

    public Vehiculo() {
    }

    public Vehiculo(String Propietario, String Cedula, String matricula, String modelo, String tipo, GregorianCalendar fechaCompra, String enReparacion) {
        this.Propietario = Propietario;
        this.Cedula = Cedula;
        this.matricula = matricula;
        this.modelo = modelo;
        this.tipo = tipo;
        this.fechaCompra = fechaCompra;
        this.enReparacion = enReparacion;
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
        return this.matricula;
    }

    /**
     * Metodo que modifica la matricula del vehiculo.
     *
     * @param matricula Nuevo matricula del vehiculo que se quiere guardar.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Metodo que devuelve el modelo del vehiculo.
     *
     * @return Devuelve el modelo del vehiculo.
     */
    public String getModelo() {
        return this.modelo;
    }

    /**
     * Metodo que modifica el modelo del vehiculo.
     *
     * @param modelo Nuevo modelo del vehiculo que se quiere guardar.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo que devuelve el tipo de vehiculo.
     *
     * @return Devuelve el tipo de vehiculo.
     */
    public String getTipo() {
        return this.tipo;
    }

    /**
     * Metodo que modifica el tipo de vehiculo.
     *
     * @param tipo Nuevo tipo de vehiculo que se quiere guardar. Este siempre
     * sera una de las tres constantes estaticas definidas en la clase.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public GregorianCalendar getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(GregorianCalendar fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getEnReparacion() {
        return enReparacion;
    }

    public void setEnReparacion(String enReparacion) {
        this.enReparacion = enReparacion;
    }

    /**
     * Metodo que devuelve la fecha de compra del vehiculo.
     *
     * @return Devuelve la fecha de compra del vehiculo.
     */

    

    /**
     * Metodo que devuelve si el vehiculo esta siendo reparado actualmente en el
     * taller o no.
     *
     * @return Devuelve un valor booleano que indica si el vehiculo esta siendo
     * reparado actualmente en el taller o no.
     */
    
}
