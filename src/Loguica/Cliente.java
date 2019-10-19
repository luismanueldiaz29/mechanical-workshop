package Loguica;

/**
 * Clase que representa los clientes de un taller.
 *
 * @author German Martinez Maldonado
 * @version 1.0, 22/02/10
 */
public class Cliente {

    //DeclaraciOn de los datos miembros como privados para que no puedan ser modificados directamente desde fuera de la clase.
    private String Propietario;
    private String apellidos;
    private String nombre;
    private String direccion;
    private String dni;

    public Cliente() {
    }

    public Cliente(String apellidos, String nombre, String direccion, String dni) {
        //Se almacenan en cada uno de los datos miembros los valores pasados como parametros.
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}