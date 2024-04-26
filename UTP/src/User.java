package src;

public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private Ticket[] ticketLists;

    private static int MAX_TICKET() {
        return 0;
    }

    public User(String email, String password, String fullName, double balance) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
    }

    public boolean addTicket(Ticket ticket) {
        return false;
    }

    public void displayAllTicket(){
        
    }

    public boolean isMatch (String email, String password){
        return false;
    }

    public String getEmail(){
        return  this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public String  getFullName(){
        return this.fullName;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
    }

}
