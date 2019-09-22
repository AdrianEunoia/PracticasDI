package Practica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EntradaPractica1 {
    public static void main(String[] args) {
        // VAR MENU
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean menu=true;
        // VAR EJERCICIO
        ArrayList<Double> arrayTemperaturas = new ArrayList<Double>();
        double totalSumaTemperaturas = 0;
        while(menu){
            System.out.println("Opcion 1 Introducir temperatura");
            System.out.println("Opcion 2 Mostrar todas las temperaturas");
            System.out.println("Opcion 3 Mostrar las temperaturas ordenadas");
            System.out.println("Opcion 4 Mostrar la menor y la mayor temperatura");
            System.out.println("Opcion 5 Mostrar media de temperaturas");
            System.out.println("Opcion 6 Salir del menu");
            // Recojo opcion
            System.out.printf("Opción: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    boolean menuTecladoTemperaturas=true;
                    String opcionTemperaturas;
                    while(menuTecladoTemperaturas) {
                        System.out.println("Introduce una temperatura: ");
                        Double temperaturaIntroducida = scanner.nextDouble();
                        arrayTemperaturas.add(temperaturaIntroducida);
                        System.out.println("Temperatura introducida con exito.");
                        System.out.println("¿Seguir introduciendo temperaturas? si/no");
                        opcionTemperaturas = scanner.next();
                        if (opcionTemperaturas.equals("si")) {
                            menuTecladoTemperaturas=true;
                        }else{
                            menuTecladoTemperaturas=false;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Mostrando temperaturas.");
                    for (int i=0;i<arrayTemperaturas.size();i++){
                        int contador = i+1;
                        System.out.printf("La temperatura %d es %f grados centigrados\n",contador,arrayTemperaturas.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Mostrando temperaturas ordenadas.");
                    Collections.sort(arrayTemperaturas);
                    for (int i=0;i<arrayTemperaturas.size();i++){
                        int contador = i+1;
                        System.out.printf("La temperatura %d es %f grados centigrados\n",contador,arrayTemperaturas.get(i));
                    }
                    break;
                case 4:
                    Collections.sort(arrayTemperaturas);
                    System.out.println("Mostrando los extremos.");
                    System.out.printf("La temperatura mas baja son %f\n",arrayTemperaturas.get(0));
                    Collections.reverse(arrayTemperaturas);
                    System.out.printf("La temperatura mas alta son %f\n",arrayTemperaturas.get(0));
                    break;
                case 5:
                    int contador=0;
                    for (int i=0;i<arrayTemperaturas.size();i++){
                        contador = i+1;
                        totalSumaTemperaturas = totalSumaTemperaturas+arrayTemperaturas.get(i);
                        System.out.println(totalSumaTemperaturas);
                    }
                    double contadorDouble = contador;
                    System.out.printf("La media de la(s) %d temperaturas es de %f\n",contador,totalSumaTemperaturas/contador);
                    break;
                case 6:
                    menu=false;
                    break;
            }
        }
    }
}
