import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineMarketPlace {
    private Map<EvenType , List<Subscriber>> subscribers;
    private List<Product> products;
    private List<Offer> offers;

    public OnlineMarketPlace() {
        this.subscribers = new HashMap<>();
        initSubscruberEvent();
        products = new ArrayList<>();
        offers = new ArrayList<>();
    }

    private void initSubscruberEvent() {
        subscribers.put(EvenType.NEW_OFFER, new ArrayList<>());
        subscribers.put(EvenType.NEW_PRODUCT, new ArrayList<>());
    }

    public void addSubscribe(EvenType evenType ,Subscriber subscriber){
        subscribers.get(evenType).add(subscriber);
    }


    public void addProduct(Product product){
        products.add(product);
        notifySubscribers(EvenType.NEW_PRODUCT , "New product is add : " + product.getName());
    }


    public void addOffer(Offer offer){
        offers.add(offer);
        notifySubscribers(EvenType.NEW_OFFER , "New offer is here : "+ offer.getMessage());
    }

    public void notifySubscribers(EvenType evenType, String message){
        subscribers.get(evenType).forEach(subscriber -> {
            subscriber.notify(message);
        });
    }

    public void unsubscribe(EvenType evenType, Subscriber subscriber){
        subscribers.get(evenType).remove(subscriber);
    }


}
