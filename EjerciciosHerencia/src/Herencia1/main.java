package Herencia1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Coche c1 = new Coche("rojo", 4, 100, 1600 );
        Camioneta ca1 = new Camioneta("naranja", 4, 150, 3000, 700);
        Bicicleta b1 = new Bicicleta("gris", 2, "deportiva");
        Motocicleta m1 = new Motocicleta("negro", 2, "deportiva", 220, 750);

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        listaVehiculos.add(c1);
        listaVehiculos.add(ca1);
        listaVehiculos.add(b1);
        listaVehiculos.add(m1);

        catalogar(listaVehiculos);
        System.out.println("Ingrese la cantidad de ruedas del vehiculo: ");
        int nRuedas= sc.nextInt();
        cantRuedas(nRuedas, listaVehiculos);


    }
    public static void catalogar(ArrayList<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos){
            System.out.println(vehiculo.toString());
        }

    }

    public static void cantRuedas(int nRuedas, ArrayList<Vehiculo> listaVehiculos) {
        int contador = 0;
        for (Vehiculo vehiculo: listaVehiculos){
            if (vehiculo.getRuedas()==nRuedas){
                System.out.println(vehiculo.getClass().getSimpleName());
                contador++;
            }
        }
        System.out.println("Se encontraron "+contador+" vehiculos con "+ nRuedas+ " ruedas");
    }
}
