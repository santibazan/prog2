package ej1;

public abstract class Animal {
    private String nombre;
    private int edad;
    private String tipoAnimal;
    private double precio;

    public Animal() {
    }

    //CONSTRUCTOR
    public Animal(String nombre, int edad, String tipoAnimal, double precio) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
        this.precio = precio;
    }

    //GETTER Y SETTER
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

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // METODOS
    public void Alimentar() {
        System.out.println("Estoy alimentando a " + getNombre());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
