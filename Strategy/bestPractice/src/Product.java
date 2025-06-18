public class Product {
    public String name;
    public double price;

    private final PricingStrategy  strategy;

    public Product(String name, double price, PricingStrategy strategy) {
        this.name = name;
        this.price = price;
        this.strategy = strategy;
    }

    public double calculatePrice(){
        return strategy.calculatePrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
