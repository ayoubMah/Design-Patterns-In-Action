public class Main {
    public static void main(String[] args) {
        OnlineMarketPlace onlineMarketPlace = new OnlineMarketPlace();

        Subscriber ayoub = new Customer("Ayoub");
        Subscriber yassine = new Customer("Yassine");
        Subscriber danil = new Customer("Danil");

        onlineMarketPlace.addSubscribe(EvenType.NEW_OFFER , ayoub);
        onlineMarketPlace.addSubscribe(EvenType.NEW_PRODUCT , yassine);

        onlineMarketPlace.addSubscribe(EvenType.NEW_OFFER , danil);
        onlineMarketPlace.addSubscribe(EvenType.NEW_PRODUCT , danil);

        onlineMarketPlace.addProduct(new Product("Iphone11", 14555));
        onlineMarketPlace.addOffer(new Offer("50% for the first product"));
    }
}