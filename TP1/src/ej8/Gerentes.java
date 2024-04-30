package ej8;

public class Gerentes extends Empleado {
    private String departamento;

    public Gerentes() {
    }

    public Gerentes(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void organizar(){
        System.out.println("Gerente organizando actividades...");
    }
    public void trabajar(){
        System.out.println("Trabajando...");
    }
}
