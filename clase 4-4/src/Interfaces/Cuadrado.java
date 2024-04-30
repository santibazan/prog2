package Interfaces;

public class Cuadrado implements Figura, Rotable, Dibujable {
    private int lados;
    public Cuadrado() {

    }

    public Cuadrado(int lados) {
        this.lados = lados;
    }

    public float area(){
        return (float) Math.pow(lados, 2);
    }
    public void dibujar(){
        System.out.println("}Dibujando un cuadrado");
    }
    public void rotar(){
        System.out.println("Rotando cuadrado");
    }
}
