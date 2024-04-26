package src;

public class Studio {
    private Movie movie;
    private String type;
    private boolean[][] seats;

    public Studio(String type) {
        this.type = type;
        this.movie = null;
        setSeats();
    }

    public String getStudioInfo() {
        return "";
    }

    public int isBooked(char row, int col) {
        return 0;
    }

    public boolean reserve(char row, int col) {
        return true;
    }

    public String getType() {
        return this.type;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    private void setSeats() {

    }
}