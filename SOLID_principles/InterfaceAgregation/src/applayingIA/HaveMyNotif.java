package applayingIA;

// so in this class i need just the sending notif so i don't need other methodes
public class HaveMyNotif implements SendingNotif{
    @Override
    public void sendNotification() {
        System.out.println("sending notification ...");
    }
}
