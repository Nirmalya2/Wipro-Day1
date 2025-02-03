public class PaymentSystem {
    // Method to process a transaction
    public static void processTransaction(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }

    public static void main(String[] args) {
        // Creating objects of CreditCard and PayPal
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();
        
        // Processing transactions
        System.out.println("Credit Card Transaction:");
        processTransaction(creditCard, 100.0);
        
        System.out.println("\nPayPal Transaction:");
        processTransaction(payPal, 100.0);
    }
}
