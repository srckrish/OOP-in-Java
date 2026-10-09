//3. Create an interface based payment system:
// Payable interface with methods pay(double amount) and getPaymentDetails().
// CreditCard class implements Payable with fields cardNumber, expiry date.
// PayPal class implements Payable with email.
// Cash class implements Payable without extra fields.
// Demonstrate polymorphism by processing payments of different types in a loop.

interface Payable {

    void pay(double amount);

    String getPaymentDetails();
}

class CreditCard implements Payable {

    private String cardNumber;
    private String expiryDate;

    CreditCard(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card.");
    }

    public String getPaymentDetails() {
        return "Credit Card | Card No: " + maskCardNumber() + " | Expiry: " + expiryDate;
    }

    // Helper method to mask card number for safe display
    private String maskCardNumber() {
        if (cardNumber.length() < 4) {
            return cardNumber;
        }
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }
}

class PayPal implements Payable {

    private String email;

    PayPal(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using PayPal.");
    }

    public String getPaymentDetails() {
        return "PayPal | Email: " + email;
    }
}

class Cash implements Payable {

    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Cash.");
    }

    public String getPaymentDetails() {
        return "Cash Payment";
    }
}

public class PaymentDemo {

    public static void main(String[] args) {
        // Array of Payable references, holding different object types
        Payable[] payments = {
            new CreditCard("1234567812345678", "12/28"),
            new PayPal("krish@example.com"),
            new Cash()
        };

        double[] amounts = {1500.0, 750.5, 200.0};

        // Loop demonstrates polymorphism: same method calls, different behavior
        for (int i = 0; i < payments.length; i++) {
            System.out.println(payments[i].getPaymentDetails());
            payments[i].pay(amounts[i]);
            System.out.println("-----------------------------");
        }
    }
}
