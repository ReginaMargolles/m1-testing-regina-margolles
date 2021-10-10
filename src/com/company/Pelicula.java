package com.company;

public class Pelicula {

    private String titulo;
    private String codigo;
    private String descripccion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String codigo, String descripccion) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.descripccion = descripccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", codigo='" + codigo + '\'' +
                ", descripccion='" + descripccion + '\'' +
                '}';
    }
}
