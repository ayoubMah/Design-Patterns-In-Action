public class Main {
    public static void main(String[] args) {
        Product pc = new Product("pc" , 200.55);
        double pcPrice = pc.calculatePrice(MemberShipType.REGULAR);
        System.out.println("pc price is " + pcPrice);

        Product phone = new Product("phone" , 170.55);
        double phonePrice = pc.calculatePrice(MemberShipType.PREMIUM);
        System.out.println("phone price is " + phonePrice);

        CheckOut checkOut = new CheckOut();
        checkOut.processPayment(pcPrice , PaymentMethod.PAYPAL);
        checkOut.processPayment(phonePrice , PaymentMethod.VISA);
    }
}