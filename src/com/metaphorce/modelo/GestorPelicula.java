package com.metaphorce.modelo;

import java.util.ArrayList;



public class GestorPelicula {

    static ArrayList<Pelicula> coleccionPeliculas= new ArrayList<>();



    //MÉTODOS
    public static void agregarPelicula(Pelicula pelicula){ //AGREGAR PELÍCULA
        coleccionPeliculas.add(pelicula);
        System.out.println("Pelicula agregada: "+pelicula.getNombre());
    }

    public static void eliminarPelicula(int idPelicula){ //ELIMINAR PELÍCULA
        System.out.println("Eliminar pelicula con id: "+idPelicula);
        boolean encontrado = false;
        for (Pelicula pelicula : coleccionPeliculas) {    //bucle for-each de la lista coleccionPeliculas
            if (pelicula.getIdPelicula() == idPelicula) { //comprobamos si id coincide con el actual
                coleccionPeliculas.remove(pelicula);         //si coincide eliminamos la pelicula actual de la colección
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("Pelicula eliminada con id: " + idPelicula );
        }else{
            System.out.println("--Pelicula no eliminada, id no encontrado--");
        }
    }


    public static void obtenerPeliculas(){  //OBTENER PELICULAS todas
        System.out.println("LISTA: Todas las peliculas disponibles/no disponibles");
        for (Pelicula pelicula : coleccionPeliculas) {
            System.out.println(pelicula);
        }
    }

    public static void obtenerPeliculasDisponibles(){
        System.out.println("LISTA: Peliculas disponibles");
        for (Pelicula pelicula : coleccionPeliculas){
            if (pelicula.isDisponible()){
                System.out.println(pelicula);
            }
        }
    }

    public static void obtenerPeliculasNoDisponibles(){
        System.out.println("LISTA: Peliculas NO disponibles");
        for (Pelicula pelicula : coleccionPeliculas){
            if (!pelicula.isDisponible()){ //busca hasta que pelicula no esté disponible
                System.out.println(pelicula);
            }
        }
    }

    public static void marcarPeliculaComoDisponible(int id, boolean disponible){
        for (Pelicula pelicula : coleccionPeliculas){
            if (pelicula.getIdPelicula() == id){

                if (disponible){
                    pelicula.setDisponible(true);
                    System.out.println("Le pelicula " + pelicula.getNombre() + " esta disponible");
                }else{
                pelicula.setDisponible(false);
                System.out.println("Le pelicula " + pelicula.getNombre() + " ahora no está disponible");}
            }
        }
    }



}
