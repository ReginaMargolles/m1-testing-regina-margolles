package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            List<Pelicula> lista = new ArrayList<Pelicula>();
            Pelicula pelicula_por_defecto = new Pelicula_Terror("chuky", "123", "Pelicula de terror", Recomendaciones.MAYORES_DE_18);
            lista.add(pelicula_por_defecto);
            Pelicula pelicula;
            OperacionesMemoriaDinamica controlador = new OperacionesMemoriaDinamica();
            String opcion = null;
            do {
                System.out.println("**********MENU**********");
                System.out.println("** 1. Crear una nueva pelicula");
                System.out.println("** 2. Ver una pelicula concreta ");
                System.out.println("** 3. Ver todas las peliculas");
                System.out.println("** 4. Modificar una pelicula ");
                System.out.println("** 5. Borrar una pelicula concreta");
                System.out.println("** 6. Borrar todas las peliculas");
                opcion = scanner.nextLine();

                switch (opcion) {
                    case "1":
                        lista = controlador.Crear_nueva_pelicula(lista);
                        break;

                    case "2":
                        pelicula = controlador.Ver_una_pelicula(lista);
                        System.out.println(pelicula.toString());
                        break;

                    case "3":
                        controlador.Ver_todas_las_peliculas(lista);
                        break;
                    case "4":
                        lista = controlador.Modificar_una_pelicula(lista);
                        break;
                    case "5":
                        controlador.Borrar_una_pelicula(lista);
                        break;
                    case "6":
                        controlador.Borrar_todas_peliculas(lista);
                        break;


                }


            } while (!opcion.equals("Salir"));

            // write your code here
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}