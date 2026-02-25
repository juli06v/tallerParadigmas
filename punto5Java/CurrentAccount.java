// CurrentAccount HEREDA de Account

package punto5Java;
public class CurrentAccount extends Account {

    private double overdraftLimit; // atributo propio
    private String pin;
    private int lastCheckNumber;

    public CurrentAccount(String name, String address, double balance,
                          double overdraftLimit, String pin) {
        super(name, address, balance);
        this.overdraftLimit = overdraftLimit;
        this.pin = pin;
        this.lastCheckNumber = 0;
    }

    // Método nuevo
    public boolean verify(String enteredPin) {
        return pin.equals(enteredPin);
    }

    // Aquí estamos SOBRESCRIBIENDO withdraw
    // Porque esta cuenta permite sobregiro
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    // Método nuevo
    public void printCheckbook() {
        System.out.println("Last check number: " + lastCheckNumber);
    }

    // Sobrescribe método abstracto
    @Override
    public void printStatement() {
        System.out.println("Current Account Statement");
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}