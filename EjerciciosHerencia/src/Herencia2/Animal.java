package Herencia2;

public class Animal {
    private String nombre;
    private int edad;
    private String genero;

    public Animal() {
    }

    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void hacer_sonido(){
        System.out.println("El animal hace un sonido generico");
    }


    public void info(){
        System.out.println("El nombre del animal es "+getNombre());
        System.out.println("La edad del animal es "+getEdad());
        System.out.println("El genero del animal es "+getGenero());

    }
}