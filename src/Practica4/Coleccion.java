package Practica4;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Coleccion {
    // En esta clase unicamente manejaremos el uso de las hashtables de las demas entidades
    // Cuenta
    private Hashtable<String, Multimedia> registroMultimedia;
    public Coleccion(){
        registroMultimedia = new Hashtable<String, Multimedia>();
    }
    // Metodos
    // Comprobar
    public boolean estaCodigo(String codigo){
        return registroMultimedia.containsKey(codigo);
    }
    // Agregar
    public void agregarMultimedia (Multimedia multimedia){
        if (!estaCodigo(multimedia.getCodigo())){
            registroMultimedia.put(multimedia.getCodigo(),multimedia);
            System.out.println("Libro registrado con extio");
        }else{
            System.out.println("El codigo que intenta registrar ya está en nuestra base de datos");
        }
    }
    // Eliminar
    public void eliminarMultimedia (String codigo){
        if(estaCodigo(codigo)){
            registroMultimedia.remove(codigo);
            System.out.println("Libro eliminado con extio");
        }
        else{
            System.out.println("No tenemos ningun codigo asociado en nuestra base de datos");
        }
    }
    // Comprobar digital
    public boolean comprobarDigital(String digital){
        if (digital.equals("si")){
            return true;
        }
        else{
            return false;
        }
    }
    // Listar
    public void listarDatos(){
        Enumeration<Multimedia> listarRegistros = registroMultimedia.elements();
        while (listarRegistros.hasMoreElements()){
            Multimedia multimediaListado = listarRegistros.nextElement();
            multimediaListado.mostrarDatos();
        }
    }
    // Exportar lista
    public void extraerFichero() {
        // Escribir Fichero
        //Ruta relativa desde la raiz del proyecto.
        File ficheroAlumnos = new File("src/Practica4/fichero.obj");
        //Tener un objeto que posibilita a escribir cosas
        // Declaro fuera
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(ficheroAlumnos));
            oos.writeObject(registroMultimedia);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // Importar lista
    public void importarFichero() {
        File ficheroAlumnosLectura = new File("src/Practica4/fichero.obj");
        ObjectInputStream oii = null;
        try {
            oii = new ObjectInputStream(new FileInputStream(ficheroAlumnosLectura));
            registroMultimedia = (Hashtable<String, Multimedia>) oii.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
