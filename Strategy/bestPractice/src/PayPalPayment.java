public class PayPalPayment implements PaymentSrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Pay Pal Payment processing...");

    }
}
