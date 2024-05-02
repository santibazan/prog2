import java.util.ArrayList;

public class Sede {
    private int fase;
    private String date;
    private String hour;
    private Instalacion instation;
    private ArrayList<Prueba> tests;

    public Sede(int fase, String date, String hour) {
        this.fase = fase;
        this.date = date;
        this.hour = hour;
        this.tests = new ArrayList<>();
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
    public Instalacion getinstation(){
        return instation;
    }
    public void setinstation(Instalacion instation){
        this.instation = instation;
    }
    public ArrayList<Prueba> getTests(){
        return tests;
    }
    public void addTest(Prueba test){
        tests.add(test);
    }
}
