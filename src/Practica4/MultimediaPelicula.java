
package Practica4;

import java.io.Serializable;

public class MultimediaPelicula extends Multimedia implements Serializable {
    // Var no heredadas
    private String actores, paises;
    private int duracion;
    public MultimediaPelicula(String titulo, String autor, String codigo, int año, String actores, String paises, int duracion) {
        super(titulo, autor, codigo, año);
        this.actores = actores;
        this.paises = paises;
        this.duracion = duracion;
    }
    // Metodos
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.printf("Los actores son %d ",actores);
        System.out.printf("Los paises implicados son %s ",paises);
        System.out.printf("La duracion es %d \n",duracion);
    }
}