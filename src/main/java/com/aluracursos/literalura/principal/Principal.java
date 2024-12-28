package com.aluracursos.literalura.principal;

import com.aluracursos.literalura.service.ConsumoApi;
import com.aluracursos.literalura.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConvierteDatos conversor = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);

    public void muestraElMenu() {
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    \n ¡¡BIENVENIDO A LITERALURA!! \n
                    1 - Buscar libro por título
                    2 - Buscar autor por nombre
                    3 - Listar libros registrados
                    4 - Listar autores registrados
                    5 - Listar autores vivos en un determinado año
                    6 - Listar libros por idioma
                    7 - Estadísticas generales
                    8 - Top 10 libros más descargados
                    9 - Listar autores nacidos en algún año
                    10 - Listar autores fallecidos en algún año
                    
                    0 - Salir
                    """;

            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    //buscarLibroPorTitulo();
                    break;
                case 2:
                    //buscarAutorPorNombre();
                    break;
                case 3:
                    //listarLibrosRegistrados();
                    break;
                case 4:
                    //listarAutoresRegistrados();
                    break;
                case 5:
                    //listarAutoresVivos();
                    break;
                case 6:
                    //listarLibrosPorIdioma();
                    break;
                case 7:
                    //estadisticas();
                    break;
                case 8:
                    //top10();
                    break;
                case 9:
                    //listarAutorPorFechaNacimiento();
                    break;
                case 10:
                    //listarAutorPorFechaFallecimiento();
                    break;
                case 0:
                    System.out.println("Cerrando aplicación ... \n");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}

