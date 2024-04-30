package ej1;

public class Main {
    public static void main(String[] args) {

        TiendaMascotas tienda = new TiendaMascotas();

        Perro perro = new Perro("Coco", 3, "Perro", 100, "Labrador", true);
        Gato gato = new Gato("Garfield", 5, "Gato", 50, "Persa", true);
        Ave ave = new Ave("Piolin", 2, "Ave", 30, "Canario", false);
        Pez pez = new Pez("Nemo", 1, "Pez", 20, "Payaso", false);

        tienda.addAnimal(perro);
        tienda.addAnimal(gato);
        tienda.addAnimal(ave);
        tienda.addAnimal(pez);

        tienda.listarAnimales();

        tienda.venderAnimal("Garfield");

        tienda.listarAnimales();

        tienda.alimentarAnimal("Coco");
    }
}