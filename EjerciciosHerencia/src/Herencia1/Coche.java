package Herencia1;

//el extends lo usamos en el objeto hijo
public class Coche extends Vehiculo {

    //Creamos las clases
    private int velocidad;
    private int cilindrada;

    //Constructor vacio
    public Coche() {
    }


    //Constructor sobrecargado
    public Coche(String color, int ruedas, int velocidad, int cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    //Getter
    public int getVelocidad() {
        return velocidad;
    }

    //Setter
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //Getter
    public float getCilindrada() {
        return cilindrada;
    }

    //Setter
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Coche: color: "+getColor() + " ruedas: "+ getRuedas() + " velocidad maxima: "+ getVelocidad()+ " cilindrada: "+ getCilindrada();
    }
}