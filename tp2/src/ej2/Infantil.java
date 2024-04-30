package ej2;

public class Infantil extends Libro {
    private String type;

    public Infantil(String title, String author, int publicationYear, boolean borrowed, String type) {
        super(title, author, publicationYear, borrowed);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}