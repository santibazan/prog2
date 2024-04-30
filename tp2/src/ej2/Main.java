package ej2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro n1 = new Novela("Matar a un ruiseñor", "Harper Lee", 1960, false,"Ficcion");
        Libro uni1 = new Universitario("Indtroduccion a Algoritmos", "Thomas H. Cormen", 1990, true,"Ciencia de Computadoras");
        Libro inf1 = new Infantil("Goodnight Moon", "Margaret Wise Brown", 1947, false,"0-3 years");


        biblioteca.agregarLibro(n1);
        biblioteca.agregarLibro(uni1);
        biblioteca.agregarLibro(inf1);


        biblioteca.listarLibrosDisponibles();


        biblioteca.prestarLibro("Goodnight Moon");
        biblioteca.listarLibrosDisponibles();


        biblioteca.devolverLibro("Goodnight Moon");
        biblioteca.listarLibrosDisponibles();
    }
}