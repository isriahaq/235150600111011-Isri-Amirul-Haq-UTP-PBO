package src;

public class Movie {
    private String tittle;
    private double rating;
    private String[] genres;

    public Movie(String tittle, double rating) {
        this.tittle = tittle;
        this.rating = rating;
    }

    public Movie(String tittle, double rating, String[] genres) {
        this.tittle = tittle;
        this.rating = rating;
        this.genres = genres;
    }

    public String getTitle() {
        return this.tittle;
    }

    public double getRating() {
        return this.rating;
    }

    public String[] getGenres() {
        return this.genres;
    }

    public void setGenres(String[] genres) {
    }
}
