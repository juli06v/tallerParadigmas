// BasicAccount HEREDA de Account
// Usa Extends para denotar la herencia 

package punto5Java;
public class BasicAccount extends Account {

    public BasicAccount(String name, String address, double balance) {
        super(name, address, balance);
    }

    // Este método es OBLIGATORIO porque es abstracto en la clase padre
    // Aquí estamos SOBRESCRIBIENDO (override)
    @Override
    public void printStatement() {
        System.out.println("Basic Account Statement");
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}