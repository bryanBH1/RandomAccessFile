/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RandomAccess {
    RandomAccessFile raf = null; 
    File file;
    
    public RandomAccess(){
        try {
            file = new File("archivo.obj"); //nombre del archivo
            raf = new RandomAccessFile(file, "rw"); //acceso al archivo en modo lectura y escritura
        } catch (FileNotFoundException ex) { 
        }
    }
    public void CrearArchivo() throws Exception{
        if (raf != null) { 
            raf.close();
        } 
    }
    
    public void AgregarInicio(double number) throws Exception {
        raf.seek(0);  //posicion 0
        raf.writeDouble(number);  //agrego dato
        raf.close(); //ciero archivo
    }

    public void AgregarFinal(double number) throws Exception { 
        raf.seek(raf.length()); //obtengo el tamaño del archivo y agrego 8 bytes
        raf.writeDouble(number); //escribo el dato
        raf.close(); //ciero archivo
    }

    public void Imprimir() throws Exception {
        raf.seek(0);//me posicion al principio
        int i=0; 
        try{
            while (true ) {//leo el archivo hasta el final
                System.out.println("Posicion ["+i+"] = "+raf.readDouble());  //muestro los datos
                i++;
            }
        }catch(Exception ex){ }
    }

    public void LeerArchivo()throws Exception {
        if (raf != null) { //intenta abrir el archivo
            raf.close();
        } 
    }
    
    public double Buscar(double numero) throws Exception {
        raf.seek(0); //me posicion al principio

        try{
            while (true) { //leo hasta el final
                if(raf.readDouble()==numero){ //comparo
                    return raf.getFilePointer()/8; //regreso la posicion
                } 
            }
        }catch(Exception ex){ }
        return 0;
    }
    
    public void Editar(double numero, double nuevo) throws Exception {
        raf.seek(0); //me posicion al principio

        try{
            while (true) { //leo hasta el final
                if(raf.readDouble()==numero){ //compruebo el numero
                    raf.seek(raf.getFilePointer()-8); //obtengo posicion y me situo al principio para hacer la modificacion
                    raf.writeDouble(nuevo);  //cambio el dato
                }        
            }               
        }catch(Exception ex){ }
    }
    
    public ArrayList<Double> Recuperar(){
        ArrayList<Double> numeros = new ArrayList<Double>(); //creo un arralist de tipo double
        try {
            raf = new RandomAccessFile("archivo.obj","rw"); //indico que el archivo a leer
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(RandomAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            while (true) {
                numeros.add(raf.readDouble()); //obtengo todos los datos del archivo en el arraylist                
            }
        }catch(Exception ex){ }
        
        return numeros; //retorno el arraylist
        
    }
    
    public void Eliminar(double pos) throws Exception {
            raf.seek(0); //me posiciono al principio
            ArrayList<Double> numeros = Recuperar(); //llamo el metodo recuperar

            numeros.remove((int) pos);//elimino por posicion

            raf = new RandomAccessFile("archivo.obj","rw"); //indico que archivo se va a recrear el archivo
            raf.setLength(0); // indicar que el archivo no tiene nada
            raf.seek(0); // asegurarse de que el puntero esté al principio del archivo

            for(Double num: numeros){
                raf.writeDouble(num); //reeescribo los datos con el ciclo
            }

            raf.close(); 
     }
    
    
    
    
}