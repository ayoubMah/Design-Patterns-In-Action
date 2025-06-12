package applayingIA;

public class ManageMyTasks implements ToDOManagmemtService { /* so here i can imp sending notif or not  */
    @Override
    public void createTask() {
        System.out.println("creating task ...");
    }

    @Override
    public void assignTaskTo(String name) {
        System.out.println("assigning task to "+ name);
    }
}
