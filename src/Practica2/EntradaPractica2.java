package Practica2;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class EntradaPractica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean menu=true;
        Hashtable<String, Persona> listaPersonas = new Hashtable<String, Persona>();
        while(menu){
            System.out.println("Opcion 1 Rellenar alumno sin que se repita");
            System.out.println("Opcion 2 Borrar alumno");
            System.out.println("Opcion 3 Buscar alumno");
            System.out.println("Opcion 4 Listar alumnos");
            System.out.println("Opcion 5 Listar DNIs");
            System.out.println("Opcion 6 Salir del menu");
            // Var
            String nombre,apellido,dni;
            int matricula = 0;

            // Recojo opcion
            System.out.printf("Opción: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.printf("Teclea un nombre para introducir: ");
                    nombre = scanner.next();
                    System.out.printf("Teclea un apellido para introducir: ");
                    apellido = scanner.next();
                    System.out.printf("Teclea un dni para introducir: ");
                    dni = scanner.next();
                    System.out.printf("Teclea una matricula para introducir: ");
                    matricula = scanner.nextInt();
                    if(listaPersonas.containsKey(dni)) {
                        System.out.println("No se puede introducir un alumno con DNI duplicado");
                    }
                    else {
                        Persona persona = new Persona(nombre,apellido,dni,matricula);
                        listaPersonas.put(persona.getDni(),persona);
                        System.out.println("Introducido con exito");
                        System.out.println(persona.getNombre());
                    }
                    break;
                case 2:
                    System.out.printf("Introduce el DNI del alumno a borrar: ");
                    dni = scanner.next();
                    if(listaPersonas.containsKey(dni)) {
                        listaPersonas.remove(dni);
                    }else{
                        System.out.println("No se ha encontrado ningún alumno con ese DNI");
                    }
                    break;
                case 3:
                    System.out.printf("Introduce el DNI del alumno a buscar: ");
                    dni = scanner.next();
                    if (listaPersonas.containsKey(dni)){
                        System.out.println("Si existe");
                    }
                    else{
                        System.out.println("No existe ningún alumno con ese DNI");
                    }
                    break;
                case 4:
                    Enumeration<Persona> enumeracionPersonas = listaPersonas.elements();
                    while (enumeracionPersonas.hasMoreElements()){
                        Persona persona = enumeracionPersonas.nextElement();
                        System.out.printf("%s %s con DNI %s y matricula %d. \n",persona.getNombre(),persona.getApellido(),persona.getDni(),persona.getMatricula());
                    }
                    break;
                case 5:
                    Enumeration<Persona> enumeracionPersonasDni = listaPersonas.elements();
                    while (enumeracionPersonasDni.hasMoreElements()){
                        Persona persona = enumeracionPersonasDni.nextElement();
                        System.out.printf("%s\n",persona.getDni());
                    }
                    break;
                case 6:
                    menu=false;
                    break;
            }
        }
    }
}
