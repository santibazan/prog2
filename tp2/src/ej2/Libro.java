package ej2;

public abstract class Libro implements Prestable {

    private String title;
    private String author;
    private int publicationYear;
    private boolean borrowed;

    public Libro() {
    }

    public Libro(String title, String author, int publicationYear, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public void lend() {

    }

    @Override
    public void returnn() {

    }
}