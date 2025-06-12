package applayingDI;

public class OrderMYSQLDataBase implements DataProvider{

    @Override
    public void fetchData() {
        System.out.println("Fetching Order Details from MySQL");
    }
}
