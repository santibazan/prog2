package Herencia1;

public class Camioneta extends Coche{
    private double carga;

    public Camioneta() {

    }

    public Camioneta(String color, int ruedas, int velocidad, int cilindrada, double carga) {
        super(color, ruedas, velocidad, cilindrada);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    @Override
    public String toString() {
        return "Camioneta: color: "+getColor() + " ruedas: "+ getRuedas() + " velocidad maxima: "+ getVelocidad()+ " cilindrada: "+ getCilindrada()+ " carga: "+getCarga();
    }
}
