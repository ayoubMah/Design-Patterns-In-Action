import java.util.ArrayList;
import java.util.List;

public class OnlineMarketPlace {
    private List<User> users;
    private List<Product> products;
    private List<Offer> offers;

    public OnlineMarketPlace() {
        users = new ArrayList<>();
        products = new ArrayList<>();
        offers = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }
    public void addProduct(Product product){
        products.add(product);
        notifyUsers(product);
    }
    public void addOffer(Offer offer){
        offers.add(offer);
        notifyUsers(offer);
    }

    public void notifyUsers(Product product){
        users.forEach( user -> {
            if(user.isSubscribedProducts()) {
                user.notify(product);
            };
        });
    }

    public void notifyUsers(Offer offer){
        users.forEach( user -> {
            if(!user.isSubscribedOffers()){
                return;
            }
            user.notify(offer);
        });
    }


}
