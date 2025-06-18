public class PremiumPricing implements PricingStrategy {

    @Override
    public double calculatePrice(double price) {
        return price * 0.8;
    }
}
