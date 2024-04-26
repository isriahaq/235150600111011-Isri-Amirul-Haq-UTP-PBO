package src;

public class Cinema {
    private String name;
    private User[] listUsers;
    private Studio[] listStudio;
    private int studioCapacity;

    public Cinema(String name, int studioCapacity) {
        this.name = name;
        this.studioCapacity = studioCapacity;
        this.listUsers = new User[100];
        this.listStudio = new Studio[10];
        init();
    }

    private void init() {
    }

    public boolean registerUser(User user) {
        return true;
    }

    public User authenticateUser(String email, String password) {
        return null;
    }

    public void displayListStudio() {
    }

    public void displayStudioDetail(int studioNumber) {
    }

    public boolean addStudioWithMovies(String studioType, String movieTitle, double movieRating, String[] movieGenres) {
        return true;
    }

    public boolean bookTicket(User user, int studioNumber, char row, int col) {
        return true;
    }

    public String getName() {
        return this.name;
    }
}