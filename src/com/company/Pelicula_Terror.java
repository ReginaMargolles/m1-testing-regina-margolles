package com.company;

public class Pelicula_Terror extends Pelicula {

    private Recomendaciones recomendacion;

    public Pelicula_Terror(String titulo, String codigo, String descripccion, Recomendaciones recomendacion) {
        super(titulo, codigo, descripccion);
        this.recomendacion = recomendacion;
    }

    public Recomendaciones getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(Recomendaciones recomendacion) {
        this.recomendacion = recomendacion;
    }

    @Override
    public String toString() {
        return "Pelicula_Terror{" +
                super.toString() +
                "recomendacion=" + recomendacion +
                '}';
    }
}
