package ejercicio_personajes;

public class PersonajeBase implements Personaje{
    private String nombre;
    private int nivel;
    private int puntosVida;
    private int danio;

    public PersonajeBase() {

    }

    public PersonajeBase(String nombre, int nivel, int puntosVida, int danio) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.danio = danio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    @Override
    public int atacar() {
        return 0;
    }

    @Override
    public int defender(int danio) {
        return 0;
    }
}
