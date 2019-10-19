
package Persistencia;

import Loguica.Empleado;
import Loguica.ParteReparacion;
import Loguica.Vehiculo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import sun.util.calendar.CalendarSystem;
import sun.util.calendar.Gregorian;

public class ArchivoPartesdeReparacion {
    public static void guardarParteReparacion(ParteReparacion c){
        try{
            FileWriter archivo;
            PrintWriter escritor;
            archivo  = new FileWriter("ArchivoDeReparacion.txt",true);
            escritor = new PrintWriter(archivo);
            escritor.println(c.getPropietario()+";"+c.getCedula()+";"+c.getModelo()+";"+c.getMatricula()+";"+c.getTipo()+";"+c.getHorasEstimadas()+";"+c.getTotal()+";"+c.getEmpleado()+";"+c.getEnReparacion());
            escritor.close();
        }catch(Exception error){}
    }
    
    public static ArrayList<ParteReparacion> getDatosParteReparacions(){
        File archivo;
        FileReader lector;
        BufferedReader lectorComodo;
        ArrayList<ParteReparacion> lista = new ArrayList<ParteReparacion>();
        try{
            archivo = new File("ArchivoDeReparacion.txt");
            lector = new FileReader(archivo);
            lectorComodo = new BufferedReader(lector);
            String fila, valores[]; 
            ParteReparacion c;
            while((fila=lectorComodo.readLine())!=null){
                c = new ParteReparacion();
                valores = fila.split(";");
                c.setPropietario(valores[0]);
                c.setCedula(valores[1]);
                c.setMatricula(valores[2]);
                c.setModelo(valores[3]);
                c.setTipo(valores[4]);
                c.setHorasEstimadas(valores[5]);
                c.setTotal((valores[6]));
                c.setEmpleado(valores[7]);
                c.setEnReparacion(valores[8]);
                lista.add(c);
                //e.setHorasEstimadas(Ramdom);
                lector.close();
            }
            
        }catch(Exception error){}
        
        return lista;
    }
}
