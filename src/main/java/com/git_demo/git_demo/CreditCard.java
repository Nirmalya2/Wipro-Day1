// Derived class: CreditCard
public class CreditCard extends PaymentMethod {
    private double feePercentage = 2.0; // Example fee percentage for credit card payments

    // Implementing the processPayment method
    @Override
    public void processPayment(double amount) {
        double fee = amount * feePercentage / 100;
        double totalAmount = amount + fee;
        System.out.println("Processing Credit Card payment of $" + amount);
        System.out.println("Fee: $" + fee);
        System.out.println("Total Amount Charged: $" + totalAmount);
    }
}
