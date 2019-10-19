
package Persistencia;

import Loguica.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class ArchivoVeiculo {
    
public static void guardarVeiculo(Vehiculo c){
        try{
            FileWriter archivo;
            PrintWriter escritor;
            archivo  = new FileWriter("InformacionVeiculo.txt",true);
            escritor = new PrintWriter(archivo);
            escritor.println(c.getPropietario()+";"+c.getCedula()+";"+c.getMatricula()+";"+c.getModelo()+";"+c.getTipo()+";"+c.getEnReparacion());
            escritor.close();
        }catch(Exception error){}
    }
    
    public static ArrayList<Vehiculo> getDatosVehiculo(){
        File archivo;
        FileReader lector;
        BufferedReader lectorComodo;
        ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
        try{
            archivo = new File("InformacionVeiculo.txt");
            lector = new FileReader(archivo);
            lectorComodo = new BufferedReader(lector);
            String fila, valores[];
            Vehiculo c;
            while((fila=lectorComodo.readLine())!=null){
                c = new Vehiculo();
                valores = fila.split(";");
                c.setPropietario(valores[0]);
                c.setCedula(valores[1]);
                c.setMatricula(valores[2]);
                c.setModelo(valores[3]);
                c.setTipo(valores[4]);
                c.setEnReparacion(valores[5]);
                lista.add(c);
            }
            lector.close();
        }catch(Exception error){
        }
        return lista;
    }
 
    public static void finalizarCliente(Vehiculo c) throws IOException{
        try {
            c.setEnReparacion("Finalizado");
            FileWriter archivo;
            PrintWriter escritor;
            archivo  = new FileWriter("VehiculosAtendidos.txt",true);
            escritor = new PrintWriter(archivo);
            escritor.println(c.getPropietario()+";"+c.getCedula()+";"+c.getMatricula()+";"+c.getModelo()+";"+c.getTipo()+";"+c.getEnReparacion());
            escritor.close();
        }catch(Exception error){}
    }
    
        public static ArrayList<Vehiculo> getDatosVehiculosAtendidos(){
        File archivo;
        FileReader lector;
        BufferedReader lectorComodo;
        ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
        try{
            archivo = new File("InformacionVeiculo.txt");
            lector = new FileReader(archivo);
            lectorComodo = new BufferedReader(lector);
            String fila, valores[];
            Vehiculo c;
            while((fila=lectorComodo.readLine())!=null){
                c = new Vehiculo();
                valores = fila.split(";");
                c.setPropietario(valores[0]);
                c.setCedula(valores[1]);
                c.setMatricula(valores[2]);
                c.setModelo(valores[3]);
                c.setTipo(valores[4]);
                lista.add(c);
            }
            lector.close();
        }catch(Exception error){
        }
        return lista;
    }
}