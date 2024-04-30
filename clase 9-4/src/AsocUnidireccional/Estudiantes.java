package AsocUnidireccional;

public class Estudiantes {
    private String nombre;
    private Universidad Univ;


    public Estudiantes(String nombre, Universidad Univ) {
        this.nombre = nombre;
        this.Univ = Univ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniv() {
        return Univ;
    }

    public void setUniv(Universidad Univ) {
        this.Univ = Univ;
    }

    public void cambiarUniversidad(Universidad newUniv){
        this.Univ = newUniv;
    }
}
