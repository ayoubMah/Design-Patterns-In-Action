public class Main {
    public static void main(String[] args) {
        OnlineMarketPlace onlineMarketPlace = new OnlineMarketPlace();
        onlineMarketPlace.addUser(new User("Ahmed", true, true));
        onlineMarketPlace.addUser(new User("Ayoub", true, false));
        onlineMarketPlace.addUser(new User("Yassine", false, true));



        onlineMarketPlace.addProduct(new Product("Iphone11", 14555));
        onlineMarketPlace.addOffer(new Offer("50% for the first product"));

    }
}