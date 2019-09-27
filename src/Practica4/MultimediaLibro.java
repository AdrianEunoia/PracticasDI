package Practica4;

import java.io.Serializable;

public class MultimediaLibro extends Multimedia implements Serializable {
    // Var no heredadas
    private int edicion,paginas;
    private boolean digital;
    public MultimediaLibro(String titulo, String autor, String codigo, int año, int edicion, int paginas, boolean digital) {
        super(titulo, autor, codigo, año);
        this.edicion = edicion;
        this.paginas = paginas;
        this.digital = digital;
    }
    // Metodos
    // Mostrar datos
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.printf("La edicion es %d ",edicion);
        System.out.printf("El numero de paginas es %s ",paginas);
        System.out.printf("La diponibilidad de digital es %b \n",digital);
    }
}
