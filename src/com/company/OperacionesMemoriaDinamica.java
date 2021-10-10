package com.company;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OperacionesMemoriaDinamica implements OperacionesCRM {
    @Override
    public List<Pelicula> Crear_nueva_pelicula(List<Pelicula> lista) {
        String opcion = null;
        String titulo;
        String codigo;
        String descripcion;
        Boolean tiene_oscars;
        Integer numero_oscars;
        String productora;
        Recomendaciones recomendaciones;
        String enumerado;
        Pelicula pelicula = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el titulo de la pelicula");
        titulo = scanner.nextLine();

        System.out.println("Introduzca el codigo de la pelicula");
        codigo = scanner.nextLine();
        //scanner.nextLine();
        System.out.println("Introduzca la descripccion de la pelicula");
        descripcion = scanner.nextLine();

        System.out.println("Elija el tipo de pelicula que desea crear");
        System.out.println("1. Pelicula de comedia");
        System.out.println("2. Pelicula de dibujos");
        System.out.println("3. Pelicula de terror");

        opcion = scanner.nextLine();


        switch (opcion) {
            case "1":
                System.out.println("Introduzca si tiene oscars");
                tiene_oscars = scanner.nextBoolean();
                scanner.nextLine();

                System.out.println("Introduzca el numero de oscars");
                numero_oscars = scanner.nextInt();
                scanner.nextLine();
                pelicula = new Pelicula_Comedia(titulo, codigo, descripcion, tiene_oscars, numero_oscars);
                break;
            case "2":
                System.out.println("Introduzca la productora");
                productora = scanner.nextLine();
                pelicula = new Pelicula_Dibujos(titulo, codigo, descripcion, productora);
                break;
            case "3":
                System.out.println("Introduzca las recomendaciones");
                enumerado = scanner.nextLine();
                switch (enumerado) {
                    case "todas_las_edades":
                        recomendaciones = Recomendaciones.TODAS_LAS_EDADES;
                        break;
                    case "mayores_de_12":
                        recomendaciones = Recomendaciones.MAYORES_DE_12;
                        break;
                    case "mayores_de_18":
                        recomendaciones = Recomendaciones.MAYORES_DE_18;
                        break;
                    default:
                        recomendaciones = Recomendaciones.MAYORES_DE_18;
                        break;


                }
                pelicula = new Pelicula_Terror(titulo, codigo, descripcion, recomendaciones);



        }
        lista.add(pelicula);
        return lista;


    }

    @Override
    public Pelicula Ver_una_pelicula(List<Pelicula> lista) {
        Scanner scanner = new Scanner(System.in);
        String codigo;
        Boolean encontrado = false;
        Pelicula pelicula_encontrada = null;
        System.out.println("Escriba el codigo de la pelicula");
        codigo = scanner.next();
        for (Pelicula pelicula : lista) {


            if (pelicula.getCodigo().equals(codigo)) {
                encontrado = true;
                pelicula_encontrada = pelicula;
            }
        }
        if (encontrado) {
            System.out.println(("Se ha encontrado la pelicula"));
        } else {
            System.out.println(("La pelicula no se ha encontrado"));
        }

        return pelicula_encontrada;


    }

    @Override
    public Void Ver_todas_las_peliculas(List<Pelicula> lista) {
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula.toString());
        }
        return null;
    }

    @Override
    public List<Pelicula> Modificar_una_pelicula(List<Pelicula> lista) {
        Scanner scanner = new Scanner(System.in);
        boolean encontrado = false;
        Pelicula pelicula = null;
        String titulo;
        String codigo;
        String descripcion;
        Boolean tiene_oscars;
        Integer numero_oscars;
        String productora;
        Recomendaciones recomendaciones;
        String enumerado;
        Pelicula_Dibujos pelicula_dibujos;
        Pelicula_Comedia pelicula_comedia = null;
        Pelicula_Terror pelicula_terror;
        System.out.println("Introduzca el codigo de la pelicula");
        codigo = scanner.nextLine();

        //for (Pelicula pelicula : lista){
        for (Iterator<Pelicula> it = lista.iterator(); it.hasNext(); ) {
            pelicula = it.next();
            if (pelicula.getCodigo().equals(codigo)) {
                System.out.println("Se ha encontrado la pelicula");
                encontrado = true;
                it.remove();
            }
        }

        if (encontrado) {
            System.out.println("Introduzca el titulo de la pelicula (actual: " + pelicula.getTitulo() + ")");
            titulo = scanner.nextLine();
            pelicula.setTitulo(titulo);

            System.out.println("Introduzca el codigo de la pelicula (actual : " + pelicula.getCodigo() + ")");
            codigo = scanner.nextLine();
            pelicula.setCodigo(codigo);
            //scanner.nextLine();
            System.out.println("Introduzca la descripccion de la pelicula (actual : " + pelicula.getDescripccion() + ")");
            descripcion = scanner.nextLine();
            pelicula.setDescripccion(descripcion);
            System.out.println(pelicula.getClass().getName());

            if (pelicula.getClass().getName().equals("com.company.Pelicula_Dibujos")) {
                pelicula_dibujos = (Pelicula_Dibujos) pelicula;
                System.out.println("Introduzca el nombre de la productora (actual: " + pelicula_dibujos.getProductora() );
                productora = scanner.nextLine();
                pelicula_dibujos.setProductora(productora);
                lista.add(pelicula_dibujos);

            }

            if (pelicula.getClass().getName().equals("com.company.Pelicula_Comedia")) {
                pelicula_comedia = (Pelicula_Comedia) pelicula;
                System.out.println("Introduzca si tiene oscars (actual : " + pelicula_comedia.getTiene_oscars() + ")");
                tiene_oscars = scanner.nextBoolean();
                scanner.nextLine();
                pelicula_comedia.setTiene_oscars(tiene_oscars);

                System.out.println("Introduzca el numero de oscars (actual : " + pelicula_comedia.getNumero_de_oscars() + ")");
                numero_oscars = scanner.nextInt();
                scanner.nextLine();
                pelicula_comedia.setNumero_de_oscars(numero_oscars);
                lista.add(pelicula_comedia);

            }

            if (pelicula.getClass().getName().equals("com.company.Pelicula_Terror")) {
                pelicula_terror = (Pelicula_Terror) pelicula;
                System.out.println("Introduzca las recomendaciones (acutal : " + pelicula_terror.getRecomendacion() + ")");
                enumerado = scanner.nextLine();
                switch (enumerado) {
                    case "todas_las_edades":
                        recomendaciones = Recomendaciones.TODAS_LAS_EDADES;
                        break;
                    case "mayores_de_12":
                        recomendaciones = Recomendaciones.MAYORES_DE_12;
                        break;
                    case "mayores_de_18":
                        recomendaciones = Recomendaciones.MAYORES_DE_18;
                        break;
                    default:
                        recomendaciones = Recomendaciones.MAYORES_DE_18;
                        break;

                }
                pelicula_terror.setRecomendacion(recomendaciones);
                lista.add(pelicula_terror);

            }



        }

        return lista;

    }

        @Override
        public List<Pelicula> Borrar_una_pelicula (List < Pelicula > lista) {
            Scanner scanner = new Scanner(System.in);
            String codigo;
            boolean encontrado = false;
            System.out.println("Escriba el codigo de la pelicula a borrar");
            codigo = scanner.next();
            Pelicula pelicula;
            for (Iterator<Pelicula> it = lista.iterator(); it.hasNext(); ) {
                pelicula = it.next();
                if (pelicula.getCodigo().equals(codigo)) {
                    it.remove();
                    System.out.println("Se ha borrado la pelicula");
                    encontrado = true;
                }

            }
            if (!encontrado) {
                System.out.println("No se ha encontrado la pelicula");
            }
            return lista;
        }
        @Override
        public List<Pelicula> Borrar_todas_peliculas (List < Pelicula > lista) {
            lista.clear();
            System.out.println("Se han borrado todas las peliculas");
            return lista;
        }
    }


