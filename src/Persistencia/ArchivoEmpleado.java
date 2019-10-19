package Persistencia;

import Loguica.*;
import java.io.*;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArchivoEmpleado {
    public static void guardarEmpleado(Empleado e){
        try{
            FileWriter archivo;
            PrintWriter escritor;
            archivo  = new FileWriter("ArchivoEmpleado.txt",true);
            escritor = new PrintWriter(archivo);
            escritor.println(e.getDni()+";"+e.getNombre()+";"+e.getApellidos()+";"+e.getDireccion()+";"+e.getEspecialidad());
            escritor.close();
        }catch(Exception error){}
    }
    
    public static ArrayList<Empleado> getDatosEmpleados(){
        File archivo;
        FileReader lector;
        BufferedReader lectorComodo;
        ArrayList<Empleado> lista = new ArrayList<Empleado>();
        try{
            archivo = new File("ArchivoEmpleado.txt");
            lector = new FileReader(archivo);
            lectorComodo = new BufferedReader(lector);
            String fila, valores[];
            Empleado e;
            while((fila=lectorComodo.readLine())!=null){
                e = new Empleado();
                valores = fila.split(";");
                e.setDni(valores[0]);
                e.setNombre(valores[1]);
                e.setDireccion(valores[2]);
                e.setApellidos(valores[3]);
                e.setEspecialidad(valores[4]);
                lista.add(e);
            }
            lector.close();
        }catch(Exception error){}
        
        return lista;
    }
}
