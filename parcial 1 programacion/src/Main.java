public class Main {
    public static void main(String[] args) {

        //se crean atletas
        Atleta atleta1 = new Atleta(11486279, "Mario", 1.70, 60, 90);
        Atleta atleta2 = new Atleta(16011893, "Patricia", 1.62, 58, 55);
        Atleta atleta3 = new Atleta(39377152, "Paula", 1.64, 28, 55);
        Atleta atleta4 = new Atleta(44308927, "Santiago", 1.75, 21, 78);
        Atleta atleta5 = new Atleta(37874901, "Martin", 1.90, 24, 87);
        Atleta atleta6 = new Atleta(40069152, "Julian", 1.83, 28, 95);

        //se crean equipos
        EquipoNacional EN1 = new EquipoNacional("Celeste", "Argentina");
        EquipoNacional EN2 = new EquipoNacional("Amarillo", "Alemania");

        //se crean las pruebas
        Prueba P1 = new Prueba(002, "Martillo");
        Prueba P2 = new Prueba(003, "Salto con garrocha");
        Prueba P3 = new Prueba(004, "Lanzamineto de jabalina");

        //se crean instalaciones
        Instalacion instalation1 = new Instalacion("Campo de futbol", "Paris, Francia", "Parque de los principes", "cancha de futbol profesional");
        Instalacion instalation2 = new Instalacion("Campo de rugby", "Cordoba, Argentina", "Tala Rugby Club", "cancha de rugby amateur");

        //se crean las sedes
        Sede S1 = new Sede(1, "30/04", "15.00");

        //se agregan los atletas a equipos
        EN1.agregarAtleta(atleta1);
        EN1.agregarAtleta(atleta2);
        EN1.agregarAtleta(atleta3);
        EN2.agregarAtleta(atleta4);
        EN2.agregarAtleta(atleta5);
        EN2.agregarAtleta(atleta6);

        //ahora se agrergan a las pruebas
        P1.addAtleta(atleta1);
        P1.addAtleta(atleta4);

        //se agregan atletas a la prueba dos
        P2.addAtleta(atleta2);
        P2.addAtleta(atleta4);
        P2.addAtleta(atleta6);
        P2.addAtleta(atleta5);
        P2.addAtleta(atleta1);
        P2.addAtleta(atleta3);

        P3.addAtleta(atleta2);

        P1.setInstation(instalation1);
        P2.setInstation(instalation1);
        P3.setInstation(instalation2);

        //se agregan las pruebas a las sedes
        S1.addTest(P1);
        S1.addTest(P2);
        S1.addTest(P3);

        //se asigna una sede a la instalacion 1
        instalation1.setCampus(S1);

        //Consigna 1: nombre del tercer atleta de la prueba dos
        System.out.println("Nombre del tercer atleta de la segunda prueba");
        System.out.println("El 3er atleta de la prueba 2 ´" + P2.getTitle() + "´ de la instalacion: " + instalation1.getInstalationName() + " es: " + instalation1.getCampus().getTests().get(1).getAthletes().get(2).getName());
        System.out.println("---------------------------------------------");
        // Consigna 2: codigo de la prueba 2
        System.out.println("Codigo de la segunda prueba");
        System.out.println("El codigo de la segunda prueba es: " + instalation1.getCampus().getTests().get(1).getCode());
        System.out.println("---------------------------------------------");
        System.out.println(" ");
        //Consigna 3: altura de todos los atletas
        System.out.println("Altura de los atletas del equipo: "+ EN1.getColor() + " del pais "+ EN1.getCountry());
        for (Atleta atleta : EN1.getListaAtleta()){
            System.out.println("Nombre: " + atleta.getName() + ", Altura: "+atleta.getHeight());
            System.out.println("---------------------------------------------");
        }
        //Consigna 4: peso extra de cada atleta
        System.out.println("Peso extra de cada atleta");
        for (Atleta atleta : EN1.getListaAtleta()) {
            if (atleta.hayPesoExtra(atleta.CalcularIMC())){
                System.out.println("Pese sobrante de "+ atleta.getName()+" es de: "+ (atleta.getWeight()-(Math.pow(atleta.getHeight(),2)*24.9)));
            }else {
                System.out.println(atleta.getName()+ " del equipo "+ EN1.getColor() + " de "+ EN1.getCountry()+ " no tiene sobrepeso");
            }
        }



    }
}
