package Practica4;

public abstract class Multimedia {
    String  titulo, autor, codigo;
    int año;
    // Constructor
    public Multimedia(String titulo, String autor, String codigo, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.año = año;
    }
    // Getters Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }
    // Metodos
    // Mostrar datos
    public void mostrarDatos(){
        System.out.printf("El titulo es %s ",getTitulo());
        System.out.printf("El autor es %s ",getAutor());
        System.out.printf("El codigo es %s ",getCodigo());
        System.out.printf("El año es %d ",getAño());
    }
}
