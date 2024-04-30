package ej1;

public class Ave extends Animal {
    private String especie;
    private boolean habla;

    public Ave(){
    }
    public Ave(String nombre, int edad, String tipoAnimal, double precio, String especie, boolean habla) {
        super(nombre, edad, tipoAnimal, precio);
        this.especie = especie;
        this.habla = habla;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    @Override
    public String toString() {
        return "Hola, soy un "+getTipoAnimal()+", me llamo "+getNombre()+", tengo "+getEdad()+" años, soy un "+getEspecie()+" y valgo $"+getPrecio()+" || Habla: "+isHabla();
    }
}