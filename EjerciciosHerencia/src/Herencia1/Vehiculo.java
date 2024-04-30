package Herencia1;

public class Vehiculo {

    //Creamos las clases
    private String color;
    private int ruedas;


    //Constructor vacio(metodos)
    public Vehiculo() {
    }

    //Constructor sobrecargado (metodos)
    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    //Getter
    public String getColor() {
        return color;
    }

    //Setter
    public void setColor(String color) {
        this.color = color;
    }

    //Getter
    public int getRuedas() {
        return ruedas;
    }

    //Setter
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public void mostrarDetalles(){
        System.out.println("El color es "+ getColor());
        System.out.println("La cantidad de ruedas son "+ getRuedas());
    }
}

