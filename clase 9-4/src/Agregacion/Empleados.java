package Agregacion;

public class Empleados {
    private String nombre;
    private String grupo;

    public Empleados(String nombre, String grupo) {
        this.nombre = nombre;
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
