package AsocBidireccional;

import java.util.ArrayList;

public class Libro {
    private String nombreL;

    private ArrayList<Persona> duenio;

    public Libro(String nombreL, ArrayList<Persona> duenio) {
        this.nombreL = nombreL;
        this.duenio = duenio;
    }

    public String getNombreL() {
        return nombreL;
    }

    public void setNombreL(String nombreL) {
        this.nombreL = nombreL;
    }

    public ArrayList<Persona> getDuenio() {
        return duenio;
    }

    public void setDuenio(ArrayList<Persona> duenio) {
        this.duenio = duenio;
    }
    public void agregarPersona(Persona newPersona){
        duenio.add(newPersona);

    }
}
