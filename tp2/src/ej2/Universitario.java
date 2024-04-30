package ej2;

public class Universitario extends Libro{
    private String course;

    public Universitario(String title, String author, int publicationYear, boolean borrowed, String course) {
        super(title, author, publicationYear, borrowed);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}