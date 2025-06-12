public class User {
    private String name;
    private boolean isSubscribedOffers;
    private boolean isSubscribedProducts;

    public User(String name, boolean isSubscribedOffers, boolean isSubscribedProducts) {
        this.name = name;
        this.isSubscribedOffers = isSubscribedOffers;
        this.isSubscribedProducts = isSubscribedProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSubscribedOffers() {
        return isSubscribedOffers;
    }

    public void setSubscribedOffers(boolean subscribedOffers) {
        isSubscribedOffers = subscribedOffers;
    }

    public boolean isSubscribedProducts() {
        return isSubscribedProducts;
    }

    public void setSubscribedProducts(boolean subscribedProducts) {
        isSubscribedProducts = subscribedProducts;
    }

    public void notify(Product product) {
        System.out.println("Notifying the user " +this.name +"  About the Product " + product.getName() + " is here!");
    }

    public void notify(Offer offer) {
        System.out.println("Notifying the user " +this.name +"  About the Offer " + offer.getMessage());
    }
}
