package Practica3;

import java.util.Hashtable;

public class Banco {
    // En esta clase unicamente manejaremos el uso de las hashtables de las demas entidades
    // Cuenta
    private Hashtable<String, Cuenta> listaCuenta;
    public Banco(){
        listaCuenta = new Hashtable<String, Cuenta>();
    }
    // Metodos
        // Comprobar
    public boolean estaCuenta(String identificadorUnico){
        return listaCuenta.containsKey(identificadorUnico);
    }
        // Añadir
    public void agregarCuenta(Cuenta cuenta){
        listaCuenta.put(cuenta.getIdentificadorCliente(),cuenta);
    }
    public Cuenta buscarCliente (String identificadorCliente) {
        return listaCuenta.get(identificadorCliente);
    }
}
