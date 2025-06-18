public class CheckOut {

    private final PaymentSrategy paymentSrategy;

    public CheckOut(PaymentSrategy paymentSrategy) {
        this.paymentSrategy = paymentSrategy;
    }

    public void processPayment (double price){
        paymentSrategy.processPayment(price);
    }
}
