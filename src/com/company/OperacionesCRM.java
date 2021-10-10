package com.company;

import java.util.List;

public interface OperacionesCRM {


    //1. Crear una nueva pelicula

        List<Pelicula> Crear_nueva_pelicula (List<Pelicula> lista);

    //2. Ver una pelicula de la lista

        Pelicula Ver_una_pelicula (List<Pelicula> lista);

   //3. Ver todas la peliculas de la lista

        Void Ver_todas_las_peliculas (List<Pelicula> lista);

    //4. Modificar una pelicula de la lista

        List<Pelicula> Modificar_una_pelicula (List<Pelicula> lista);

    //5. Borrar una pelicula de la lista

        List<Pelicula> Borrar_una_pelicula (List<Pelicula> lista);

    //6. Borrar todas la peliculas

        List<Pelicula> Borrar_todas_peliculas (List<Pelicula> lista);


}
