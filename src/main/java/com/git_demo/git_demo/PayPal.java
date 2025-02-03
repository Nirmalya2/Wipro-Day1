// Derived class: PayPal
public class PayPal extends PaymentMethod {
    // Implementing the processPayment method
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("Total Amount Charged: $" + amount);
    }
}
