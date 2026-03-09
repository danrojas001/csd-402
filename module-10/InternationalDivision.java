//Dan Rojas
//08-Mar-26
//mod 10.2

public class InternationalDivision extends Division {
    private String country;
    private String language;

    //Constructor
    public InternationalDivision(String country, String language, String name, String accountNumber) {
        super(name, accountNumber);
        this.country = country;
        this.language = language;
    }

    //Getters and setters

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    void display() {
        System.out.println("Country: " + getCountry() + "\nLanguage: " + getLanguage() + "\nName: " + getName() +
                "\nAccount Number: " + getAccountNumber());
        System.out.println();
    }
}
