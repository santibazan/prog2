package ejercicio_personajes;

public class Mago extends PersonajeBase{
    public Mago(String nombre, int nivel, int puntosVida, int danio) {
        super(nombre, nivel, puntosVida, danio);
    }

    @Override
    public int atacar() {
        return this.getDanio();
    }

    @Override
    public int defender(int danio) {
        return this.getPuntosVida()-danio;
    }
}
