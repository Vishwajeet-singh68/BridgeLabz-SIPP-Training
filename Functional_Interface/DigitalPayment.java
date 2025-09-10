
// Digital Payment Interface Example
interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " using UPI"); }
}

class CreditCard implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " using Credit Card"); }
}

class Wallet implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " using Wallet"); }
}

public class DigitalPayment {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment cc = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500);
        cc.pay(1000);
        wallet.pay(300);
    }
}
