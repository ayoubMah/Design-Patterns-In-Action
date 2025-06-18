public class Main {
    public static void main(String[] args) {
        Product pc = new Product("pc" , 200.55 , new RegularPricing());
        double pcPrice = pc.calculatePrice();
        System.out.println("pc price is " + pcPrice);

        Product phone = new Product("phone" , 170.55, new PremiumPricing());
        double phonePrice = phone.calculatePrice();
        System.out.println("phone price is " + phonePrice);

        CheckOut checkOutPc = new CheckOut(new VisaPayment());
        checkOutPc.processPayment(pcPrice);

        CheckOut checkOutPhone = new CheckOut(new MasterCardPayment());
        checkOutPhone.processPayment(phonePrice);
    }
}