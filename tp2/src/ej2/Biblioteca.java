package ej2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> listaLibros;

    public Biblioteca() {
        listaLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
        System.out.println("Libro '" + libro.getTitle() + "' agregado a la biblioteca.");
    }

    public void listarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : listaLibros) {
            if (!libro.isBorrowed()) {
                System.out.println(" - " + libro.getTitle() + " (" + libro.getAuthor() + ")");
            }
        }
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitle().equals(titulo)) {
                libro.lend();
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no está disponible en la biblioteca.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitle().equals(titulo)) {
                libro.returnn();
                return;
            }
        }
        System.out.println("No se puede devolver el libro '" + titulo + "'. No se encuentra en la biblioteca.");
    }
}