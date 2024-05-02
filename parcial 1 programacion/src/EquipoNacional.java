import java.util.ArrayList;
public class EquipoNacional{
    private String color;
    private String country;
    private ArrayList <Atleta>listaAtleta = new ArrayList<>();
    //constructor
    public EquipoNacional(String color, String country) {
        this.color = color;
        this.country = country;
    }
    //getter y setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Atleta> getListaAtleta(){
        return listaAtleta;
    }
    public void setListaAtleta(ArrayList<Atleta>listaAtleta){
        this.listaAtleta=listaAtleta;
    }

    public void agregarAtleta(Atleta athlete){
        listaAtleta.add(athlete);
    }
}
