
package Loguica;
import Persistencia.*;
import Persistencia.ArchivoCliente;
import Ventanas.PartesDeReparacion;
import com.sun.crypto.provider.AESParameters;
import com.sun.org.apache.bcel.internal.generic.InstructionConstants;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Taller {
    
     
    public static String guardarCliente(String DNI, String nombres, String apellidos, String Telefono){
        if(validarVacio(DNI, nombres, apellidos, Telefono)){
            return "Existen campos vacios, valide la información";
        }else{
            if(ComprovarDNI(DNI)==true){
                return "No se permiten cedulas repetidas";
            }else{
                Cliente c = new Cliente();
                c.setDni(DNI);
                c.setNombre(nombres);
                c.setApellidos(apellidos);
                c.setDireccion(Telefono);
                ArchivoCliente.guardarCliente(c);
                return "Información a sido Guardada";
            }
        }    
    }
    
   public static void posicionBorrar(String DNI) throws IOException{
        ArrayList<Cliente> lista = ArchivoCliente.getDatos();
        int i =0;
        boolean f = false;
        if(!ComprovarDNI(DNI)){
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO LA CEDULA DIJITADA");
        }else{
            for (i = 0; i < lista.size() ; i++) {
                if(i+1==lista.size()){
                        f=true;
                        JOptionPane.showMessageDialog(null, "------------");
                }
                if(!lista.get(i).getDni().equals(DNI)){
                    
                        ArchivoCliente.PararTemporal(lista.get(i),f);
                }
                
            }
        }
    }

    
    public static boolean ComprovarDNI(String DNI){
         ArrayList<Cliente> lista = ArchivoCliente.getDatos();
        int i=0;
        for(i=0; i < lista.size(); i++){
            if(lista.get(i).getDni().equals(DNI)){
                break;
            }
        }
        if(i < lista.size()){
            return true;
        }else{
            return false;
        }
    }
    
    public static DefaultTableModel getDatos(){
        DefaultTableModel modelo = new DefaultTableModel();
        ArrayList<Cliente> lista = ArchivoCliente.getDatos();
        String[] columnas = {"cedula","Nombre","Apellido","Telefono"};
        modelo.setColumnIdentifiers(columnas);
        for(Cliente e:lista){
            String[] fila = {e.getDni(),e.getNombre(),e.getApellidos(),e.getDireccion()};
            modelo.addRow(fila);
        }
        return modelo;
    }
    
public static String[][] matris(){
        ArrayList<Cliente> lista = ArchivoCliente.getDatos();
         String matrix [][] = new String[lista.size()][4];
        for (int i = 0; i < lista.size(); i++) {
            matrix[i][0] = lista.get(i).getNombre();
            matrix[i][1] = lista.get(i).getApellidos();
            matrix[i][2] = lista.get(i).getDni();
            matrix[i][3] = lista.get(i).getDireccion();
        }
        return matrix;
    }
    
public static Cliente RetornarCliente(String DNI){
     ArrayList<Cliente> lista = ArchivoCliente.getDatos();
        int i=0;
        for(i=0; i < lista.size(); i++){
            if(lista.get(i).getDni().equals(DNI)){
                break;
            }
        }
        if(i < lista.size()){
            return lista.get(i);
        }else{
            return null;
        }
}
    public static DefaultTableModel busqueda (String DNI){
        ArrayList<Cliente> lista = ArchivoCliente.getDatos();
        int i=0;
        for(i=0; i < lista.size(); i++){
            if(lista.get(i).getDni().equals(DNI)){
                break;
            }
        }
        if (i < lista.size()) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] columnas = {"cedula","Nombre","Apellido","Telefono"};
            modelo.setColumnIdentifiers(columnas);
            String[] fila = {lista.get(i).getDni(),lista.get(i).getNombre(),lista.get(i).getApellidos(),lista.get(i).getDireccion()};
            modelo.addRow(fila);
            return modelo;
        }else{
            return null;
        }
    }
    
    
    public static boolean validarVacio(String identidad, String nombres, String apellidos, String telefono){
        if(identidad.trim().equals("") || nombres.trim().equals("") || apellidos.trim().equals("") || telefono.trim().equals("")){
            return true;
        }
        return false;
    }
    
    //--------------------------------------------[EMPLEADO]---------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------
    
    
        public static void guardarEmpleado(String DNI, String nombres, String apellidos, String Telefono, String especialidad){
        if(validarVacio(DNI, nombres, apellidos, Telefono)){
            JOptionPane.showMessageDialog(null,"Existen campos vacios, valide la información");
        }else{
            if(ComprovarDNIEmpleado(DNI)==true){
                JOptionPane.showMessageDialog(null,"No se permiten cedulas repetidas");
            }else{
                Empleado E = new Empleado();
                E.setDni(DNI);
                E.setNombre(nombres);
                E.setApellidos(apellidos);
                E.setDireccion(Telefono);
                E.setEspecialidad(especialidad);
                ArchivoEmpleado.guardarEmpleado(E);
                JOptionPane.showMessageDialog(null,"Información Guardada");
            }
        }    
    }
        
        
    public static boolean ComprovarDNIEmpleado(String DNI){
         ArrayList<Empleado> lista = ArchivoEmpleado.getDatosEmpleados();
        int i=0;
        for(i=0; i < lista.size(); i++){
            if(lista.get(i).getDni().equals(DNI)){
                break;
            }
        }
        if(i < lista.size()){
            return true;
        }else{
            return false;
        }
    }    
        
    public static DefaultTableModel getDatosEmpleado(){
        DefaultTableModel modelo = new DefaultTableModel();
        ArrayList<Empleado> lista = ArchivoEmpleado.getDatosEmpleados();
        String[] columnas = {"cedula","Nombre","Apellido","Telefono","Espacialidad"};
        modelo.setColumnIdentifiers(columnas);
        for(Empleado e:lista){
            String[] fila = {e.getDni(),e.getNombre(),e.getApellidos(),e.getDireccion(),e.getEspecialidad()};
            modelo.addRow(fila);
        }
        return modelo;
    }

    
    
    public static DefaultTableModel busquedaEmpleado (String DNI){
        ArrayList<Empleado> lista = ArchivoEmpleado.getDatosEmpleados();
        int i=0;
        for(i=0; i < lista.size(); i++){
            if(lista.get(i).getDni().equals(DNI)){
                break;
            }
        }
        if (i < lista.size()) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] columnas = {"cedula","Nombre","Apellido","Telefono","Especialidad"};
            modelo.setColumnIdentifiers(columnas);
            String[] fila = {lista.get(i).getDni(),lista.get(i).getNombre(),lista.get(i).getApellidos(),lista.get(i).getDireccion(),lista.get(i).getEspecialidad()};
            modelo.addRow(fila);
            return modelo;
        }else{
            return null;
        }
    } 
    
    public static boolean RetornarTipoDeEmpliado(String TipoServicio){
        return true;
    }
    
    public static int bacanteReparacion(){
        ArrayList<Empleado> lista = ArchivoEmpleado.getDatosEmpleados();
        int i;
        int j =0;
        for (i = 0; i < lista.size(); i++) {
            if(lista.get(i).getEspecialidad().equals("Reparacion")){
                j++;
            }
        }
        return j; 
    }
    public static int bacantePintor(){
        ArrayList<Empleado> lista = ArchivoEmpleado.getDatosEmpleados();
        int i;
        int j =0;
        for (i = 0; i < lista.size(); i++) {
            if(lista.get(i).getEspecialidad().equals("Pintura")){
                j++;
            }
        }
        return j;
    }
    public static int bacanteLavado(){
        ArrayList<Empleado> lista = ArchivoEmpleado.getDatosEmpleados();
        int i;
        int j=0;
        for (i = 0; i < lista.size(); i++) {
            if(lista.get(i).getEspecialidad().equals("Lavado")){
              j++;  
            }
        }
        return j;
    }
    
    /*----------------------------------------------[Vehiculo]--------------------------------------------------*/
    //-----------------------------------------------------------------------------------------------------------------
    
    public static String posicionCliente(int i){
        ArrayList<Cliente> c = ArchivoCliente.getDatos();
        return c.get(i).getDni();
    }
    
    public static String guardarVehiculo(String Matricula, String Modelo, String Tipo, String ce){
        int i;
        if(validarVacioVehiculo(Matricula, Modelo, Tipo, ce)){
          return "Existen campos vacios, valide la información";
        }else{
            
                if(ComprovarMatricula(Matricula)==true){
                    return "No se permiten las matriculas repetidas";
                }else{
                
                    ArrayList<Cliente> lista = ArchivoCliente.getDatos();
                
                    for(i = 0; i<lista.size(); i++){
                        if(lista.get(i).getDni().equals(ce)){
                            break;
                        } 
                    }
                    Vehiculo c = new Vehiculo();
                    if(i<lista.size()){
                        c.setPropietario(lista.get(i).getNombre());
                        c.setCedula(lista.get(i).getDni());
                        c.setMatricula(Matricula);
                        c.setModelo(Modelo);
                        c.setTipo(Tipo);
                        c.setEnReparacion("NO");
                        ArchivoVeiculo.guardarVeiculo(c);
                        return "Información Guardada";
                    }else{
                        return "No se encontro la cedula del cliente";
                    }
                }
               
        }
    }    
    public static boolean validarVacioVehiculo(String Matricula, String Modelo, String Tipo, String propietario){
        if(Matricula.trim().equals("") || Modelo.trim().equals("") || Tipo.trim().equals("") || propietario.trim().equals("")){
            return true;
        }else{ 
            return false;
        }
    }  
    public static boolean ComprovarMatricula(String matricula){
         ArrayList<Vehiculo> lista = ArchivoVeiculo.getDatosVehiculo();
        int i=0;
        for(i=0; i < lista.size(); i++){
            if(lista.get(i).getMatricula().equals(matricula)){
                break;
            }
        }
        if(i < lista.size()){
            return true;
        }else{
            return false;
        }
    }    
    
    public static DefaultTableModel getDatosVehiculos(){
        DefaultTableModel modelo = new DefaultTableModel();
        ArrayList<Vehiculo> lista = ArchivoVeiculo.getDatosVehiculo();
        String[] columnas = {"Propietario","cedula","Matricula","Modelo","Tipo De Vehiculo","En reparacion"};
        modelo.setColumnIdentifiers(columnas);
        for(Vehiculo e:lista){
            String[] fila = {e.getPropietario(),e.getCedula(),e.getMatricula(),e.getModelo(),e.getTipo(),e.getEnReparacion()};
            modelo.addRow(fila);
        }
        return modelo;
    }
    

    
    public static DefaultTableModel busquedaVehiculo(String Matricula){
        ArrayList<Vehiculo> lista =ArchivoVeiculo.getDatosVehiculo();
        int i=0;
        for(i=0; i < lista.size(); i++){
            if(lista.get(i).getMatricula().equals(Matricula)){
                break;
            }
        }
        if (i < lista.size()) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] columnas = {"Propietario","cedula","Matricula","Modelo","Tipo De Vehiculo","En Reparacion"};
            modelo.setColumnIdentifiers(columnas);
            String[] fila = {lista.get(i).getPropietario(),lista.get(i).getCedula(),lista.get(i).getMatricula(),lista.get(i).getModelo(),lista.get(i).getTipo(),lista.get(i).getEnReparacion()};
            modelo.addRow(fila);
            return modelo;
        }else{
            return null;
        }
    }
  public static String[][] matrisVeiculo(){
        ArrayList<Vehiculo> lista = ArchivoVeiculo.getDatosVehiculo();
         String matrix [][] = new String[lista.size()][6];
        for (int i = 0; i < lista.size(); i++) {
            matrix[i][0] = lista.get(i).getPropietario();
            matrix[i][1] = lista.get(i).getCedula();
            matrix[i][2] = lista.get(i).getMatricula();
            matrix[i][3] = lista.get(i).getModelo();;
        }
        return matrix;
    }
    
//public static String[][] matris(){
//        ArrayList<Cliente> lista = ArchivoCliente.getDatos();
//         String matrix [][] = new String[lista.size()][4];
//        for (int i = 0; i < lista.size(); i++) {
//            matrix[i][0] = lista.get(i).getNombre();
//            matrix[i][1] = lista.get(i).getApellidos();
//            matrix[i][2] = lista.get(i).getDni();
//            matrix[i][3] = lista.get(i).getDireccion();
//        }
//        return matrix;
//    }
//         
////    ----------------------------------------------------------------------------------------------------------     
////    ---------------------------------------------------PartesDeReparacion-------------------------------------
////    ----------------------------------------------------------------------------------------------------------

         public static String CrearPartesdeRapracion(String Cedula, String TipoDeServicio, String horasEstimadas,String empleado, String montoAPagar){
            ArrayList<Vehiculo> lista =ArchivoVeiculo.getDatosVehiculo();
            int i;
            if(!Comprovar(Cedula)){
                return "Cedula No encontrada";
            }else{
                for (i = 0; i<lista.size(); i++) {
                    
                    if(lista.get(i).getCedula().equals(Cedula)){
                        
                        ParteReparacion c = new ParteReparacion();
                        
                        c.setPropietario(lista.get(i).getPropietario());
                        c.setCedula(lista.get(i).getCedula());
                        c.setMatricula(lista.get(i).getMatricula());
                        c.setModelo(lista.get(i).getModelo());
                        c.setTipo(lista.get(i).getTipo());
                        c.setEnReparacion("Reparando");
                        c.setEmpleado(empleado);
                        c.setHorasEstimadas(horasEstimadas);
                        c.setTotal(montoAPagar);
                        ArchivoPartesdeReparacion.guardarParteReparacion(c);
                        break;
                    }
                }
                return "proceso exitoso";
            }
            
} 
         
    public static boolean Comprovar(String cedula){
         ArrayList<Vehiculo> lista = ArchivoVeiculo.getDatosVehiculo();
        int i=0;
        for(i=0; i < lista.size(); i++){
            if(lista.get(i).getCedula().equals(cedula)){
                break;
            }
        }
        if(i < lista.size()){
            return true;
        }else{
            return false;
        }
    }
     
    public static DefaultTableModel getDatoReparacion(){
        DefaultTableModel modelo = new DefaultTableModel();
        ArrayList<ParteReparacion> lista = ArchivoPartesdeReparacion.getDatosParteReparacions();
        String[] columnas = {"Propietario","cedula","Modelo","Matricula","Tipo De Vehiculo","Horas estimadas","Total a pagar","Empleado","Reparacion"};
        modelo.setColumnIdentifiers(columnas);
        for(ParteReparacion c: lista){
            String[] fila = {c.getPropietario(),c.getCedula(),c.getModelo(),c.getMatricula(),c.getTipo(),c.getHorasEstimadas(),c.getTotal(),c.getEmpleado(),c.getEnReparacion()};
            modelo.addRow(fila);
        }
        return modelo;
    }
    
    public static String[][] matrisReparacion(){
        ArrayList<ParteReparacion> lista = ArchivoPartesdeReparacion.getDatosParteReparacions();
        String matrix [][] = new String[lista.size()][6];
        for (int i = 0; i < lista.size(); i++) {
            matrix[i][0] = lista.get(i).getPropietario();
            matrix[i][1] = lista.get(i).getCedula();
            matrix[i][2] = lista.get(i).getMatricula();
            matrix[i][3] = lista.get(i).getModelo();
            matrix[i][4] = lista.get(i).getTipo();
            matrix[i][5] = lista.get(i).getEnReparacion();
        }
        return matrix;
    }
    
}