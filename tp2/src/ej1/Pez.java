package ej1;

public class Pez extends Animal {
    private String especie;
    private boolean venenoso;

    public Pez(){
    }
    public Pez(String nombre, int edad, String tipoAnimal, double precio, String especie, boolean venenoso) {
        super(nombre, edad, tipoAnimal, precio);
        this.especie = especie;
        this.venenoso = venenoso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    @Override
    public String toString() {
        return "Hola, soy un "+getTipoAnimal()+", me llamo "+getNombre()+", tengo "+getEdad()+" años, soy un "+getEspecie()+" y valgo $"+getPrecio()+" || Venenoso: "+isVenenoso();
    }
}