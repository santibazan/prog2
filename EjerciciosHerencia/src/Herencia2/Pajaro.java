package Herencia2;


public class Pajaro extends Animal{
    private String plumaje;
    private float peso;

    public Pajaro(String nombre, int edad, String genero, String plumaje, float peso) {
        super(nombre, edad, genero);
        this.plumaje = plumaje;
        this.peso = peso;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void volar(){
        System.out.println("El pajaro esta volando");
    }

    public void hacer_sonido(){
        System.out.println("Pio pio");
    }
    public void info(){
        System.out.println("El plumaje del pajaro es: "+getPlumaje());
        System.out.println("El peso del pajaro es: "+getPeso());
    }

}