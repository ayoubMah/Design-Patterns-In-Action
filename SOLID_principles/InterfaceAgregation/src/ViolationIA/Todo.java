package ViolationIA;

public class Todo implements ToDOManagmemt {
    String name;
    String description;

    @Override
    public void createTask() {
        System.out.println("Creating task");
    }

    @Override
    public void assignTaskTo(String name) {
        System.out.println("Assigning task to " + name);
    }

    // so we should imp this methode even we don't need it
    // so i'll create other class Notification to imp this functionality
    @Override
    public void sendNotification() {
        System.out.println("sorry the functions of sending notification are not available");
    }
}
