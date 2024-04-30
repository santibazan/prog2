package Interfaces;

public class Circulo implements Figura, Dibujable {
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float area(){
        return (float) (Math.PI * Math.pow(radio, 2));
    }
    public void dibujar(){
        System.out.println("Dibujando un circulo");
    }
}
