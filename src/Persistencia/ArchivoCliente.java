/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Loguica.Cliente;
import java.io.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArchivoCliente {
    
    public static void guardarCliente(Cliente c){
        try{
            FileWriter archivo;
            PrintWriter escritor;
            archivo  = new FileWriter("InformacionCliente.txt",true);
            escritor = new PrintWriter(archivo);
            escritor.println(c.getNombre()+";"+c.getApellidos()+";"+c.getDni()+";"+c.getDireccion());
            escritor.close();
        }catch(Exception error){}
    }
    
    public static ArrayList<Cliente> getDatos(){
        File archivo;
        FileReader lector;
        BufferedReader lectorComodo;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        try{
            archivo = new File("InformacionCliente.txt");
            lector = new FileReader(archivo);
            lectorComodo = new BufferedReader(lector);
            String fila, valores[];
            Cliente c;
            while((fila=lectorComodo.readLine())!=null){
                c = new Cliente();
                valores = fila.split(";");
                c.setNombre(valores[0]);
                c.setApellidos(valores[1]);
                c.setDni(valores[2]);
                c.setDireccion(valores[3]);
                lista.add(c);
            }
            lector.close();
        }catch(Exception error){
        }
        return lista;
    }
    
    
            
    public static void ArchivoTemporal(int e){
        //lectores
        File archivo = new File("InformacionCliente.txt");
        FileReader lector;
        BufferedReader lectorComodo;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
       
        //archivos temporal 
        File Temporal = new File("ArchivoTemporal.txt");
        FileWriter archTem;
        PrintWriter escritor;
        try {
            int i=0;
            //archivos temporal            
            archTem  = new FileWriter(Temporal,true);
            escritor = new PrintWriter(archTem);
            //creo mi archivo lector
           
            lector = new FileReader(archivo);
            lectorComodo = new BufferedReader(lector);
            String fila, valores[];
            
            while((fila=lectorComodo.readLine())!=null){
               Cliente c;
                if(i!=e){
                    c = new Cliente();
                    valores = fila.split(";");
                    escritor.println(valores[0]+";"+valores[1]+";"+valores[2]+";"+valores[3]);
                    archTem.close();
               }
               i++;
            }
            //archivo.renameTo(Temporal);
            //Temporal.delete();
        } catch (Exception f) {
        }
//        archivo.delete();
//        Temporal.renameTo(archivo);
    }
    
    public static void PararTemporal(Cliente c, boolean ae) throws IOException{
        File f;
        try {
            File e = new File("Itemporal.txt");
            FileWriter archivo;
            PrintWriter escritor;
            archivo  = new FileWriter(e,true);
            escritor = new PrintWriter(archivo);
            escritor.println(c.getNombre()+";"+c.getApellidos()+";"+c.getDni()+";"+c.getDireccion());
            escritor.close(); 
            if(ae==true){
                e.renameTo(f=new File("InformacionCliente.txt"));
                e.delete();
            }
        } catch (Exception e) {
        }   
    }
    
    /*public static void eliminar(Cliente c){
        try{
            FileWriter archivo;
            PrintWriter escritor;
            archivo  = new FileWriter("InformacionCliente.txt",true);
            escritor = new PrintWriter(archivo);
            escritor.println("");
            escritor.close();
        }catch(Exception error){}

    }*/
}
