//Dan Rojas
//08-Mar-26
//mod 10.2

abstract class Division {

    private String Name;
    private String accountNumber;

    public Division(String Name, String accountNumber) {
        this.Name = Name;
        this.accountNumber = accountNumber;
    }

    //Getters and setters

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //Subclasses must implement
    abstract void display();
}
