package Practica3;

import java.util.Scanner;

public class EntradaCajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean menu=true;
        // Declaracion hashtables
        Banco registroBanco = new Banco();
        Personal registroPersonal = new Personal();
        while(menu){
            System.out.println("Opcion 1 Crear una cuenta con saldo");
            System.out.println("Opcion 2 Sacar dinero");
            System.out.println("Opcion 3 Meter dinero");
            System.out.println("Opcion 4 Ver saldo");
            System.out.println("Opcion 5 Mostrar todos los datos de una persona");
            System.out.println("Opcion 6 Salir del cajero");
            // Recojo opcion
            System.out.printf("Opción: ");
            String nombre,apellidos,identificadorCliente;
            int pin,saldo,cantidadIntroducir,cantidadSacar;
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Introduce un titular de la cuenta: ");
                    nombre = scanner.next();
                    System.out.println("Introduce los apellido/s del titular: ");
                    apellidos = scanner.next();
                    System.out.println("Introduce el saldo inicial de la cuenta: ");
                    saldo = scanner.nextInt();
                    System.out.println("Introduce el pin de la cuenta: ");
                    pin = scanner.nextInt();
                    System.out.println("Introduce el identificador: ");
                    identificadorCliente = scanner.next();
                    if (!registroPersonal.estaCliente(identificadorCliente)){
                        Cliente cliente = new Cliente(nombre,apellidos,identificadorCliente);
                        registroPersonal.agregarCliente(cliente);
                        Cuenta cuenta = new Cuenta(nombre,apellidos,saldo,pin,identificadorCliente);
                        registroBanco.agregarCuenta(cuenta);
                        System.out.println("Se ha registrado la cuenta con exito");
                    }else{
                        System.out.println("El identidificador de cliente introducido ya está registrado");
                    }
                    break;
                case 2:
                    System.out.println("Introduce el identificador: ");
                    identificadorCliente = scanner.next();
                    if(registroBanco.estaCuenta(identificadorCliente)){
                        Cuenta cuentaEncontrada = registroBanco.buscarCliente(identificadorCliente);
                        int pinComprobar = cuentaEncontrada.getPin();
                        System.out.printf("Introduce el pin: ");
                        pin = scanner.nextInt();
                        if(pin == pinComprobar){
                            System.out.println("Pin correcto");
                            System.out.println("¿Cuanto dinero desa introducir?");
                            cantidadIntroducir = scanner.nextInt();
                            cuentaEncontrada.meterDinero(cantidadIntroducir);
                            System.out.printf("El nuevo saldo corresponde a %d euros\n",cuentaEncontrada.getSaldo());
                        }
                        else{
                            System.out.println("El pin introducido es no corresponde con la cuenta asociada, es incorrecto");
                        }
                    }else{
                        System.out.println("No existe ningún cliente con ese ID asociado");
                    }
                    break;
                case 3:
                    System.out.println("Introduce el identificador: ");
                    identificadorCliente = scanner.next();
                    if(registroBanco.estaCuenta(identificadorCliente)){
                        Cuenta cuentaEncontrada = registroBanco.buscarCliente(identificadorCliente);
                        int pinComprobar = cuentaEncontrada.getPin();
                        System.out.printf("Introduce el pin: ");
                        pin = scanner.nextInt();
                        if(pin == pinComprobar){
                            System.out.println("Pin correcto");
                            System.out.println("¿Cuanto dinero desa introducir?");
                            cantidadSacar = scanner.nextInt();
                            cuentaEncontrada.sacarDinero(cantidadSacar);
                            System.out.printf("El nuevo saldo corresponde a %d euros\n",cuentaEncontrada.getSaldo());
                        }
                        else{
                            System.out.println("El pin introducido es no corresponde con la cuenta asociada, es incorrecto");
                        }
                    }else{
                        System.out.println("No existe ningún cliente con ese ID asociado");
                    }
                    break;
                case 4:
                    System.out.println("Introduce el identificador: ");
                    identificadorCliente = scanner.next();
                    if(registroBanco.estaCuenta(identificadorCliente)){
                        Cuenta cuentaEncontrada = registroBanco.buscarCliente(identificadorCliente);
                        int pinComprobar = cuentaEncontrada.getPin();
                        System.out.printf("Introduce el pin: ");
                        pin = scanner.nextInt();
                        if(pin == pinComprobar){
                            System.out.println("Pin correcto");
                            cuentaEncontrada.mostrarSaldo();
                        }
                        else{
                            System.out.println("El pin introducido es no corresponde con la cuenta asociada, es incorrecto");
                        }
                    }else{
                        System.out.println("No existe ningún cliente con ese ID asociado");
                    }
                    break;
                case 5:
                    System.out.println("Introduce el identificador: ");
                    identificadorCliente = scanner.next();
                    if(registroBanco.estaCuenta(identificadorCliente)){
                        Cuenta cuentaEncontrada = registroBanco.buscarCliente(identificadorCliente);
                        cuentaEncontrada.mostrarDatos();
                    }else{
                        System.out.println("No existe ningún cliente con ese ID asociado");
                    }
                    break;
                case 6:
                    menu=false;
                    break;
            }
        }
    }
}
