package Agregacion;
import java.util.ArrayList;

public class Departamento {
    private String departamento;
    private ArrayList<Empleados>empleados;

    public Departamento(String departamento, ArrayList<Empleados> empleados) {
        this.departamento = departamento;
        this.empleados = empleados;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleados newempleado){
        empleados.add(newempleado);
    }


}
