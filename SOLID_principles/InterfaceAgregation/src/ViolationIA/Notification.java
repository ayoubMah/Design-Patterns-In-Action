package ViolationIA;

public class Notification implements ToDOManagmemt{
    // in this class we want to imp just the sending notif method => so other

    @Override
    public void createTask() {
        System.out.println("this method not valable");
    }

    @Override
    public void assignTaskTo(String name) {
        System.out.println("this method not valable");
    }

    @Override
    public void sendNotification() {
        System.out.println("sending notification");
    }
}
