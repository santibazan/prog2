package ej8;

public class Trabajadores extends Empleado {
    private String area;

    public Trabajadores() {
    }

    public Trabajadores(String nombre, int edad, double salario, String area) {
        super(nombre, edad, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void producir(){
        System.out.println("Trabajadores produciendo...");
    }
    public void trabajar(){
        System.out.println("Trabajando...");
    }
}
