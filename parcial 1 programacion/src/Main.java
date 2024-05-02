public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta(11486279, "Mario", 1.70, 60, 90);
        Atleta atleta2 = new Atleta(16011893, "Patricia", 1.62, 58, 55);
        Atleta atleta3 = new Atleta(39377152, "Paula", 1.64, 28, 55);
        Atleta atleta4 = new Atleta(44308927, "Santiago", 1.75, 21, 78);

        EquipoNacional EN1 = new EquipoNacional("Celeste", "Argentina");
        EquipoNacional EN2 = new EquipoNacional("Amarillo", "Alemania");
        EquipoNacional EN3 = new EquipoNacional("Verde", "Sudafrica");
        EquipoNacional EN4 = new EquipoNacional("Rojo", "Chile");

        Prueba P1 = new Prueba(001, "Salto en largo");
        Prueba P2 = new Prueba(002, "Martillo");
        Prueba P3 = new Prueba(003, "Salto con garrocha");
        Prueba P4 = new Prueba(004, "Lanzamineto de jabalina");

        Instalacion I1 = new Instalacion("Caca", "Caca", "Caca", "Caca");
        Instalacion I2 = new Instalacion("Caca", "Caca", "Caca", "Caca");
        Instalacion I3 = new Instalacion("Caca", "Caca", "Caca", "Caca");
        Instalacion I4 = new Instalacion("Caca", "Caca", "Caca", "Caca");

        Sede S1 = new Sede(1, "30/04", "15.00");
        Sede S2 = new Sede(2, "7/05", "15.00");
        Sede S3 = new Sede(3, "14/05", "15.00");
        Sede S4 = new Sede(4, "21/04", "15.00");




    }
}
