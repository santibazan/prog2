public class Tecnico extends Operario {
    public String toString(){
        return "Nombre tecnico: "+getNombre();
    }

    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico();
    }
}
