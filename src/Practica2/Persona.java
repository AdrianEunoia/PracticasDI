package Practica2;

public class Persona {
    String nombre, apellido, dni;
    int matricula;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getMatricula() {
        return matricula;
    }

    public Persona(String nombre, String apellido, String dni, int matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return getNombre();
    }

}
