public class MasterCardPayment implements PaymentSrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Master Card Payment processing...");

    }
}
