package ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TiendaMascotas {
    private List<Animal> listaAnimales;

    public TiendaMascotas() {
        this.listaAnimales = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        listaAnimales.add(animal);
        System.out.println("Animal agregado a la tienda: " + animal.getNombre());
    }

    public void venderAnimal(String nombre) {
        Iterator<Animal> iterator = listaAnimales.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal.getNombre().equals(nombre)) {
                iterator.remove();
                System.out.println("Animal vendido: " + animal.getNombre());
                return;
            }
        }
        System.out.println("No se encontró ningún animal con el nombre " + nombre);
    }

    public void alimentarAnimal(String nombre) {
        for (Animal animal : listaAnimales) {
            if (animal.getNombre().equals(nombre)) {
                animal.Alimentar();
                return;
            }
        }
        System.out.println("No se encontró ningún animal con el nombre " + nombre);
    }

    public void listarAnimales() {
        System.out.println("Animales en la tienda:");
        for (Animal animal : listaAnimales) {
            System.out.println(animal);
        }
    }
}