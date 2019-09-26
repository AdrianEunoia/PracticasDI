package Practica3;

import java.util.Hashtable;

public class Personal {
    // En esta clase unicamente manejaremos el uso de las hashtables de las demas entidades
    // Cliente
    private Hashtable<String, Cliente> listaCliente;
    public Personal(){
        listaCliente = new Hashtable<String, Cliente>();
    }
    // Metodos
    // Comprobar
    public boolean estaCliente(String identificadorUnico){
        return listaCliente.containsKey(identificadorUnico);
    }
    // Añadir
    public void agregarCliente(Cliente cliente){
        listaCliente.put(cliente.getIdentificadorCliente(),cliente);
    }
}
