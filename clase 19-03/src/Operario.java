public class Operario extends Empleado {

    public String toString(){
        return "Nombre operario: "+getNombre();
    }

    public static void main(String[] args) {
        Operario operario = new Operario();
    }
}
