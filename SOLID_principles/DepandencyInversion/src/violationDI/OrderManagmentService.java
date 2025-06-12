package violationDI;

public class OrderManagmentService {
    private OrderDataBase orderDataBase;

    public OrderManagmentService(){
        this.orderDataBase = new OrderDataBase();
    }

    public void fetchOrderDetails() {
        orderDataBase.fetchOrder();
    }
}
