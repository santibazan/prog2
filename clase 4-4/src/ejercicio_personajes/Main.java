package ejercicio_personajes;

public class Main {
    public static void main(String[] args) {
        Guerrero g1 = new Guerrero( "santiago", 21, 100, 55 );
        Mago m1 = new Mago("Jorge", 21, 100, 60);
        Picaro p1= new Picaro("Matias", 22, 100, 40);

        System.out.println("Guerrero contra Mago...");
        System.out.println("El mago " +m1.getNombre() +" ataca infingiendo "+ m1.atacar()+" de daño");
        System.out.println("El guerrero "+g1.getNombre()+" se defiende y solo queda con "+g1.defender(m1.getDanio())+ " puntos de vida");
        System.out.println("El guerrero "+g1.getNombre()+" ataca a su oponente infingiendo "+ g1.atacar()+" de daño ");
        System.out.println("El mago " +m1.getNombre() +"se defiende y solo queda con " +m1.defender(g1.getDanio())+" puntos de vida");
        System.out.println("________________________________________________");

        System.out.println("Guerrero contra Picaro...");
        System.out.println("El Picaro " +p1.getNombre()+" ataca infingiendo "+ p1.atacar()+" de daño");
        System.out.println("El guerrero "+g1.getNombre()+" se defiende y solo queda con "+g1.defender(p1.getDanio())+ " puntos de vida");
        System.out.println("El guerrero "+g1.getNombre()+" ataca a su oponente infingiendo "+ g1.atacar()+" de daño ");
        System.out.println("El picaro "+p1.getNombre()+" se defiende y solo queda con " +p1.defender(g1.getDanio())+" puntos de vida");
        System.out.println("________________________________________________");

        System.out.println("Mago contra Picaro...");
        System.out.println("El Picaro " +p1.getNombre() + " ataca infingiendo "+ p1.atacar()+" de daño");
        System.out.println("El mago "+m1.getNombre() +" se defiende y solo queda con "+m1.defender(p1.getDanio())+ " puntos de vida");
        System.out.println("El mago "+m1.getNombre()+ " ataca a su oponente infingiendo "+ m1.atacar()+" de daño ");
        System.out.println("El picaro "+p1.getNombre()+" se defiende y solo queda con " +p1.defender(m1.getDanio())+" puntos de vida");
    }

}
