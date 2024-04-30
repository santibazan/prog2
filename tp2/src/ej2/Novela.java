package ej2;

public class Novela extends Libro {
    private String gender;

    public Novela(String title, String author, int publicationYear, boolean borrowed, String gender) {
        super(title, author, publicationYear, borrowed);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}