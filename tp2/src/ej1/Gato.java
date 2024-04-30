package ej1;

public class Gato extends Animal {
    private String raza;
    private boolean esterilizado;

    public Gato() {
    }

    public Gato(String nombre, int edad, String tipoAnimal, double precio, String raza, boolean esterilizado) {
        super(nombre, edad, tipoAnimal, precio);
        this.raza = raza;
        this.esterilizado = esterilizado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    @Override
    public String toString() {
        return "Hola, soy un "+getTipoAnimal()+", me llamo "+getNombre()+", tengo "+getEdad()+" años, soy un "+getRaza()+" y valgo $"+getPrecio()+" || Esterilizado: "+isEsterilizado();
    }
}
