package ej8;

public class Main {
    public static void main(String[] args) {
        Gerentes ger1 = new Gerentes("Santiago", 21, 20000.0, "Jefe");
        Trabajadores tra1 = new Trabajadores("Agustin", 20, 10000.0, "Empleado");

        System.out.println("Informacion gerente: ");
        System.out.println("Nombre: "+ ger1.getNombre());
        System.out.println("Edad: "+ ger1.getEdad());
        System.out.println("Salario: "+ ger1.getSalario());
        System.out.println("Departamento: "+ ger1.getDepartamento());
        System.out.println("Y sus metodos en funcion nos dan...");
        ger1.organizar();
        ger1.trabajar();
        System.out.println("------------------------------------------");

        System.out.println("Informacion trabajador: ");
        System.out.println("Nombre: "+tra1.getNombre());
        System.out.println("Edad: "+tra1.getEdad());
        System.out.println("Salario: "+tra1.getSalario());
        System.out.println("Area: "+tra1.getArea());
        System.out.println("Y sus metotods en funcion nos dan...");
        tra1.producir();
        tra1.trabajar();


    }
}