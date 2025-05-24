package com.metaphorce.modelo;

public class Pelicula {
    //ATRIBUTOS
    int idPelicula;//identificador
    String nombre;
    boolean disponible;


    //CONSTRUCTORES

    public Pelicula(int idPelicula, String nombre, boolean disponible) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    //GET y SET
    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        String disponibleString = "";
        if (disponible) {
            disponibleString = "Si";
        }else{disponibleString = "No";}
        return "- Pelicula: " + nombre +  "\t Id: " + idPelicula +     '\'' +     ", Disponible: " + disponibleString +
                '.';
    }
}
