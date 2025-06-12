package applayingDI;

import violationDI.OrderDataBase;

public class OrderMONGODataBase implements DataProvider{

    @Override
    public void fetchData() {
        System.out.println("Fetching Order Details from MongoDB");
    }
}
