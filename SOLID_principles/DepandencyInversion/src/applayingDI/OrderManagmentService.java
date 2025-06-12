package applayingDI;


public class OrderManagmentService {
    private DataProvider dataProvider;

    public OrderManagmentService(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public void fetchOrderDetails() {
        dataProvider.fetchData();
    }
}
