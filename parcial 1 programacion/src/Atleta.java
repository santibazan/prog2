import java.lang.Math;
import java.util.Random;
public class Atleta extends Persona implements Contrato {
    private double height;
    private int age;
    private double weight;
    private EquipoNacional EquipoNacional;
    private Prueba Prueba;


    //Constructor
    public Atleta(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }
    //getter y setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double CalcularIMC(){
        return this.weight/Math.pow(this.height, 2);

    }
    public boolean hayPesoExtra(double weight){
        double IMC = CalcularIMC();

        if (IMC>24.9){
            return true;
        }else {
            return false;
        }
    }
    public double tomarPulsaciones(){
        Random ran = new Random();
        return  ran.nextInt((60-40)+1)+40;
    }

}
