package Practica4;

import java.io.Serializable;

public class MultimediaMusica extends Multimedia implements Serializable {
    // Var no heredadas
    private String formato;
    private int duracion;
    private boolean directo;
    public MultimediaMusica(String titulo, String autor, String codigo, int año, String formato, int duracion, boolean directo) {
        super(titulo, autor, codigo, año);
        this.formato = formato;
        this.duracion = duracion;
        this.directo = directo;
    }
    // Metodos
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.printf("El formato es %s ",formato);
        System.out.printf("La duración es %s ",duracion);
        System.out.printf("La diponibilidad de directo es %b \n",directo);
    }
}