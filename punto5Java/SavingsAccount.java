// SavingsAccount HEREDA de Account
package punto5Java;
public class SavingsAccount extends Account {

    private double interestRate; // atributo propio

    public SavingsAccount(String name, String address,
                          double balance, double interestRate) {
        super(name, address, balance);
        this.interestRate = interestRate;
    }

    // Método nuevo (NO heredado)
    public void payInterest() {
        balance += balance * interestRate;
    }

    // Sobrescribe método abstracto
    @Override
    public void printStatement() {
        System.out.println("Savings Account Statement");
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}