package Herencia2;


public class main {
    public static void main(String[] args) {
        Perro dog = new Perro("Tito", 7, "Masculino", "Dogo", "Negro");
        Gato cat = new Gato("Michi", 5, "Femenino", "Malo", 4);
        Pajaro bird = new Pajaro("Pio", 1, "No binario", "Degradado", 10);


        dog.info();
        dog.hacer_sonido();
        dog.jugar();
        System.out.println("_________________");
        cat.info();
        cat.hacer_sonido();
        cat.limpiar();
        System.out.println("_________________");
        bird.info();
        bird.hacer_sonido();
        bird.volar();


    }
}