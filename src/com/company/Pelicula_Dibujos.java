package com.company;

public class Pelicula_Dibujos extends Pelicula {

    private String productora;

    public Pelicula_Dibujos(String titulo, String codigo, String descripccion, String productora) {
        super(titulo, codigo, descripccion);
        this.productora = productora;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Pelicula_Dibujos{" +
                super.toString() +
                "productora='" + productora + '\'' +
                '}';
    }
}
