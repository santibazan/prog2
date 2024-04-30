package Agregacion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empleados e1 = new Empleados("Santiago", "Comunicaciones");
        Empleados e2 = new Empleados("Jorge", "Ventas");
        Empleados e3 = new Empleados("Matias", "Limpieza");
        Empleados e4 = new Empleados("Andres", "RRHH");
        Empleados e5 = new Empleados("Agustin", "Gerente");
        Empleados e6 = new Empleados("Ramiro", "Marketing");
        Empleados e7 = new Empleados("Manuel", "Logistica");

        Departamento d1 = new Departamento("Desarrollo", new ArrayList<>());
        Departamento d2 = new Departamento("Ventas", new ArrayList<>());
    }
}
