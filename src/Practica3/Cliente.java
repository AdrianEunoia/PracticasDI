package Practica3;

public class Cliente {
    // Variables
    String nombre,apellidos,identificadorCliente;
    // Hashtable
    // Constructor
    public Cliente(String nombre, String apellidos, String identificadorCliente) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificadorCliente = identificadorCliente;
    }
    // Getters & Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public String getIdentificadorCliente() { return identificadorCliente; }
    public void setIdentificadorCliente(String identificadorCliente) { this.identificadorCliente = identificadorCliente; }
    // Metodos
}
