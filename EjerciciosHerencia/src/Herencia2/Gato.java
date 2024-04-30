package Herencia2;

public class Gato extends Animal{
    private String personalidad;
    private int hijos;

    public Gato(String nombre, int edad, String genero, String personalidad, int hijos) {
        super(nombre, edad, genero);
        this.personalidad = personalidad;
        this.hijos = hijos;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public int gethijos() {
        return hijos;
    }

    public void sethijos(int hijos) {
        this.hijos = hijos;
    }

    public void limpiar(){
        System.out.println("El gato esta limpiandose con su boca");
    }
    public void hacer_sonido(){
        System.out.println("Miau miau");
    }

    public void info(){
        System.out.println("La personalidad del gato es: "+getPersonalidad());
        System.out.println("La cantidad de hijos que tiene el gato es: "+gethijos());
    }

}
