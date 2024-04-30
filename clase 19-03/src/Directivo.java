public class Directivo extends Empleado {
    public String toString(){
        return "Nombre directivo: "+getNombre();
    }

    public static void main(String[] args) {
        Directivo directivo = new Directivo();
    }
}
