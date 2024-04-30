package ejercicio_personajes;

public class Picaro extends PersonajeBase{
    public Picaro(String nombre, int nivel, int puntosVida, int danio) {
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
