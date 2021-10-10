package com.company;

public class Pelicula_Comedia extends Pelicula {

    private Boolean tiene_oscars;
    private Integer numero_de_oscars;

    public Pelicula_Comedia(String titulo, String codigo, String descripccion, Boolean tiene_oscars, Integer numero_de_oscars) {
        super(titulo, codigo, descripccion);
        this.tiene_oscars = tiene_oscars;
        this.numero_de_oscars = numero_de_oscars;
    }

    public boolean isTiene_oscars() {
        return tiene_oscars;
    }

    public Boolean getTiene_oscars() {
        return tiene_oscars;
    }

    public void setTiene_oscars(boolean tiene_oscars) {
        this.tiene_oscars = tiene_oscars;
    }

    public int getNumero_de_oscars() {
        return numero_de_oscars;
    }

    public void setNumero_de_oscars(int numero_de_oscars) {
        this.numero_de_oscars = numero_de_oscars;
    }

    @Override
    public String toString() {
        return "Pelicula_Comedia{" +
                super.toString() +
                "tiene_oscars=" + tiene_oscars +
                ", numero_de_oscars=" + numero_de_oscars +
                '}';
    }
}
