package Herencia2;


public class Perro extends Animal{
    private String raza;
    private String color;

    //Constructores
    public Perro(String nombre, int edad, String genero, String raza, String color) {
        super(nombre, edad, genero);
        this.raza = raza;
        this.color = color;
    }

    //Getter and setter
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void jugar(){
        System.out.println("El perro esta buscando la pelota");
    }

    public void hacer_sonido(){
        System.out.println("Guau guau");
    }

    public void info(){
        System.out.println("La raza del perro es: "+getRaza());
        System.out.println("El color del perro es: "+getColor());
    }

}