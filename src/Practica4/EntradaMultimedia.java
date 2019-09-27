package Practica4;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

public class EntradaMultimedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean menu=true;
        // Declaracion hashtables
        Coleccion registroMultimedia = new Coleccion();
        while(menu){
            System.out.println("Opcion 1 Agregar elemento");
            System.out.println("Opcion 2 Eliminar elemento");
            System.out.println("Opcion 3 Listar elementos");
            System.out.println("Opcion 4 Importar lista de elementos");
            System.out.println("Opcion 5 Exportar lista de elementos");
            System.out.println("Opcion 6 Salir del cajero");
            // Recojo opcion
            System.out.printf("Opción: ");
            String titulo,autor,codigo,formato,actores,paises,comprobarDigital,comprobarDirecto;
            int año,edicion,paginas,duracion;
            boolean digital,directo;
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    String opcionIntroducir;
                    System.out.println("¿Que contenido multimedia deseas introducir? Libro/Musica/Pelicula");
                    opcionIntroducir = scanner.next();
                    if(opcionIntroducir.equals("libro")){
                        System.out.println("Vamos a introducir un libro, complete los siguientes campos.");
                        System.out.println("Introduce un titulo");
                        titulo = scanner.next();
                        System.out.println("Introduce un autor");
                        autor = scanner.next();
                        System.out.println("Introduce un año");
                        año = scanner.nextInt();
                        System.out.println("Introduce un codigo");
                        codigo = scanner.next();
                        System.out.println("Introduce una edicion");
                        edicion = scanner.nextInt();
                        System.out.println("¿Es compatible con soporte digital? Si/No");
                        comprobarDigital = scanner.next();
                        digital = registroMultimedia.comprobarDigital(comprobarDigital);
                        System.out.println("Introduce un numero de paginas");
                        paginas = scanner.nextInt();
                        Multimedia nuevoLibro = new MultimediaLibro(titulo,autor,codigo,año,edicion,paginas,digital);
                        registroMultimedia.agregarMultimedia(nuevoLibro);
                    }else if(opcionIntroducir.equals("musica")){
                        System.out.println("Vamos a introducir una cancion, complete los siguientes campos.");
                        System.out.println("Introduce un titulo");
                        titulo = scanner.next();
                        System.out.println("Introduce un autor");
                        autor = scanner.next();
                        System.out.println("Introduce un año");
                        año = scanner.nextInt();
                        System.out.println("Introduce un codigo");
                        codigo = scanner.next();
                        System.out.println("Introduce una formato");
                        formato = scanner.next();
                        System.out.println("¿Es compatible con directo digital? Si/No");
                        comprobarDirecto = scanner.next();
                        directo = registroMultimedia.comprobarDigital(comprobarDirecto);
                        System.out.println("Introduce una duración");
                        duracion = scanner.nextInt();
                        Multimedia nuevaCancion = new MultimediaMusica(titulo,autor,codigo,año,formato,duracion,directo);
                        registroMultimedia.agregarMultimedia(nuevaCancion);
                    }else if(opcionIntroducir.equals("pelicula")){
                        System.out.println("Vamos a introducir una pelicula, complete los siguientes campos.");
                        System.out.println("Vamos a introducir una cancion, complete los siguientes campos.");
                        System.out.println("Introduce un titulo");
                        titulo = scanner.next();
                        System.out.println("Introduce un autor");
                        autor = scanner.next();
                        System.out.println("Introduce un año");
                        año = scanner.nextInt();
                        System.out.println("Introduce un codigo");
                        codigo = scanner.next();
                        System.out.println("Introduce los actores");
                        actores = scanner.next();
                        System.out.println("Introduce los paises implicados");
                        paises = scanner.next();
                        System.out.println("Introduce una duración");
                        duracion = scanner.nextInt();
                        Multimedia nuevaPelicula = new MultimediaPelicula(titulo,autor,codigo,año,actores,paises,duracion);
                        registroMultimedia.agregarMultimedia(nuevaPelicula);
                    }
                    break;
                case 2:
                    String opcionEliminar;
                    System.out.println("¿Que contenido multimedia deseas eliminar? Libro/Musica/Pelicula");
                    opcionEliminar = scanner.next();
                    if(opcionEliminar.equals("libro")){
                        System.out.println("Vamos a eliminar un libro, introduce el codigo del libro a eliminar");
                        codigo = scanner.next();
                        registroMultimedia.eliminarMultimedia(codigo);
                    }else if(opcionEliminar.equals("musica")){
                        System.out.println("Vamos a eliminar una cancion, introduce el codigo de la cancion a eliminar");
                        codigo = scanner.next();
                        registroMultimedia.eliminarMultimedia(codigo);
                    }else if(opcionEliminar.equals("pelicula")){
                        System.out.println("Vamos a eliminar una pelicula, introduce el codigo de la pelicula a eliminar");
                        codigo = scanner.next();
                        registroMultimedia.eliminarMultimedia(codigo);
                    }
                    break;
                case 3:
                    String opcionListar;
                    System.out.println("¿Que contenido multimedia deseas listar? Libro/Musica/Pelicula");
                    opcionListar = scanner.next();
                    if(opcionListar.equals("libro")){
                        System.out.println("Vamos a listar libros");
                        registroMultimedia.listarDatos();
                    }else if(opcionListar.equals("musica")){
                        System.out.println("Vamos a listar canciones");
                        registroMultimedia.listarDatos();
                    }else if(opcionListar.equals("pelicula")){
                        System.out.println("Vamos a listar peliculas");
                        registroMultimedia.listarDatos();
                    }
                    break;
                case 4:
                    registroMultimedia.importarFichero();
                    break;
                case 5:
                    registroMultimedia.extraerFichero();
                    break;
                case 6:
                    menu=false;
                    break;
            }
        }
    }
}
