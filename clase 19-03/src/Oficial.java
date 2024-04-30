public class Oficial extends Operario {
    public String toString(){
        return "Nombre oficial: "+getNombre();
    }

    public static void main(String[] args) {
        Oficial oficial = new Oficial();
    }
}
