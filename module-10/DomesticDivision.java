//Dan Rojas
//08-Mar-26
//mod 10.2

public class DomesticDivision extends Division {
    private String state;

    //Constructor
    public DomesticDivision(String state, String name, String accountNumber) {
        super(name, accountNumber);
        this.state = state;
    }

    //Getter and setter

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    void display() {
        System.out.println("State: " + getState() + "\nName: " + getName() + "\nAccount Number: " + getAccountNumber());
        System.out.println();
    }
}
