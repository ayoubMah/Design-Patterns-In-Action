public class CheckOut {

    public void processPayment (double price , PaymentMethod paymentMethod){
        if (paymentMethod.equals(PaymentMethod.VISA)){
            System.out.println("Processing Visa Payment ...");
        }else if (paymentMethod.equals(PaymentMethod.MASTERCARD)){
            System.out.println("Processing Master Card Payment ...");
        } else if (paymentMethod.equals(PaymentMethod.PAYPAL)) {
            System.out.println("Processing Paypal Payment ...");
        }
    }
}
