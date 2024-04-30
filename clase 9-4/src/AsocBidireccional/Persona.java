package AsocBidireccional;
import java.util.ArrayList;

public class Persona {
    private String nombre;

    private ArrayList<Libro> libros;

    public Persona(String nombre, ArrayList<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    public void agregarLibro(Libro newLibro) {
        libros.add(newLibro);
        newLibro.agregarPersona(this);
    }

    public void mostrarLibro(){
        System.out.println("Lista de libros de " + nombre + ":");
        for (Libro libro : libros) {
            System.out.println("- " + libro.getNombreL());
        }
    }
}
