public class VisaPayment implements PaymentSrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Visa Payment processing...");

    }
}
