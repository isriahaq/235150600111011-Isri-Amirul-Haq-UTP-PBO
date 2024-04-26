package src;

public class Ticket {
    private Movie movie;
    private int studioNumber;
    private double price;
    private String seat;

    public Ticket(Movie movie, int studioNumber, String seat) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.seat = seat;
    }

    public String getTicketInfo() {
        return "";
    }

    public Movie getMovie() {
        return this.movie;
    }

    public int getStudioNumber() {
        return this.studioNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getSeat() {
        return this.seat;
    }

    public static double getTicketPrice(String type) {
        return getTicketPrice(type);
    }
}