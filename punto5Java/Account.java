// Clase abstracta padre
// No se puede crear un objeto directamente de Account (cada clase "Account" es de diferente tipo.)
// Sirve como base para las demás cuentas

package punto5Java;
public abstract class Account {

    // Atributos que TODAS las cuentas heredan
    protected String name;
    protected String address;
    protected double balance;

    public Account(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    // Método que será HEREDADO por todas las subclases
    public void deposit(double amount) {
        balance += amount;
    }

    // Método que será HEREDADO (pero puede ser sobrescrito)
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Método heredado
    public void changeAddress(String newAddress) {
        address = newAddress;
    }

    // Método heredado
    public double getBalance() {
        return balance;
    }

    // Método abstracto
    // OBLIGA a las subclases a implementarlo
    public abstract void printStatement();
}