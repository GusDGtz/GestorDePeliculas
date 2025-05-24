package com.metaphorce.vista;
import com.metaphorce.modelo.GestorPelicula;
import com.metaphorce.modelo.Pelicula;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Nuevo funcionalidad buscar por nombre");
        int opcion = 0;
        int contadorId = 6;
        System.out.println("Skill challenge 1");
        Pelicula pelicula01 = new Pelicula(1, "Titanic", true); //DECLARAMOS LAS PELICULAS
        Pelicula pelicula02 = new Pelicula(2, "Harry Potter", false);
        Pelicula pelicula03 = new Pelicula(3, "Interestellar", false);
        Pelicula pelicula04 = new Pelicula(4, "Sonic", true);
        Pelicula pelicula05 = new Pelicula(5, "Metegol", true);

        //agreagar variable tipo gestionar peliculas

        GestorPelicula.agregarPelicula(pelicula01);  //PELICULAS AGREGADAS A LA COLECCIÓN
        GestorPelicula.agregarPelicula(pelicula02);
        GestorPelicula.agregarPelicula(pelicula03);
        GestorPelicula.agregarPelicula(pelicula04);
        GestorPelicula.agregarPelicula(pelicula05);

        System.out.println("- - - - - - INICIO - - - - -");
        System.out.println("Aplicacion de gestion de peliculas: Ingrese el numero correspondiente para manejar las peliculas de la colección.");
        while (opcion != 7){
            System.out.println("=== === === === === === MENU OPCIONES === === === === === ===");
            System.out.println("[1]+ Agregar   [3]i Peliculas Disponibles    [5]:Obtener lista");
            System.out.println("[2]x Eliminar  [4]o Peliculas no disponibles [6]~Marcar disponible");
            System.out.println("[7]Terminar programa");
            Scanner teclado = new Scanner(System.in);  //INGRESA OPCION
            opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("__ __ __ __ + Agregar Pelicula + __ __ __ __");//anadir pelicula nueva
                int idCase1; String nom, stringdisponibleCase1; boolean disponibleCase1 = false;

                System.out.println("Ingrese el nombre de la pelicula");
                nom = teclado.next();
                System.out.println("La pelicula esta disponible? si/no");
                stringdisponibleCase1 = teclado.next();
                if (stringdisponibleCase1.equals("si")) {
                    disponibleCase1 = true;
                }else{
                    if (!stringdisponibleCase1.equalsIgnoreCase("no")){
                        System.out.println("Caracter incorrecto, pelicula marcada como no disponble");
                    }
                }
                Pelicula pelicula = new Pelicula(contadorId, nom, disponibleCase1);
                GestorPelicula.agregarPelicula(pelicula);
                contadorId++;
                break;

            case 2:
                System.out.println("__ __ __ __ x Eliminar Pelicula x __ __ __ __");
                int idCase2;
                System.out.println("Ingrese el id de la pelicula");
                idCase2 = teclado.nextInt();
                GestorPelicula.eliminarPelicula(idCase2);
                break;
            case 3:
                System.out.println("__ __ __ __ i Obtener Peliculas Disponibles i __ __ __ __");
                GestorPelicula.obtenerPeliculasDisponibles();
                break;
            case 4:
                System.out.println("__ __ __ __ o Obtener Peliculas no disponibles o __ __ __ __");
                GestorPelicula.obtenerPeliculasNoDisponibles();
                break;
            case 5:
                System.out.println("__ __ __ __ : Obtener lista de la coleccion : __ __ __ __");
                GestorPelicula.obtenerPeliculas();
                break;
            case 6:
                System.out.println("__ __ __ __ ~ Marcar disponibilidad de pelicula ~ __ __ __ __");
                GestorPelicula.obtenerPeliculas();
                boolean disponibleCase6 = false; String stringDisponibleCase6 ; int idCase6 = 0;  //variales a utilizar
                System.out.println("Ingrese el id de la pelicula");   //elige que pelicula modificar
                idCase6 = teclado.nextInt();
                System.out.println("Marcar como: [1]Disponible [0]No disponible");   //elige su disponibilidad
                stringDisponibleCase6 = teclado.next();

                if (stringDisponibleCase6.equals("1")) {            //conversion string -> boolean
                    disponibleCase6 = true;
                }


                GestorPelicula.marcarPeliculaComoDisponible(idCase6, disponibleCase6);
                break;
            case 7:
                System.out.println("x Terminando programa x");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        }
        System.out.println("- - - PROGRAMA TERMINADO - - -");
    }

}
