package Practica3;

public class Cuenta {
    // Variables
    String nombre,apellidos,identificadorCliente;
    int saldo,pin;
    // Constructor
    public Cuenta(String nombre, String apellidos, int saldo, int pin, String identificadorCliente) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.saldo = saldo;
        this.pin = pin;
        this.identificadorCliente = identificadorCliente;
    }
    // Getters & Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public int getSaldo() { return saldo; }                       
    public void setSaldo(int saldo) { this.saldo = saldo;}
    public int getPin() { return pin; }
    public void setPin(int pin) { this.pin = pin; }
    public String getIdentificadorCliente() { return identificadorCliente; }
    public void setIdentificadorCliente(String identificadorCliente) { this.identificadorCliente = identificadorCliente; }
    // Metodos
    public void meterDinero(int dinero) {
        this.saldo += dinero;
    }
    public void sacarDinero(int dinero) {
        this.saldo -= dinero;
    }
    public void mostrarDatos(){
        System.out.printf("%s %s tiene %d euros con el pin %d y el ID %s\n",nombre,apellidos,saldo,pin,identificadorCliente);
    }
    public void mostrarSaldo(){
        System.out.printf("%s %s tiene disponibles %d euros\n",nombre,apellidos,saldo);
    }
}



