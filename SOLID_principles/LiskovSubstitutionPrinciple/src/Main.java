import applyingLSP.Employee;
import applyingLSP.PartTimeEmp;


public class Main {
    public static void main(String[] args) {
        // creating full time emp
        PartTimeEmp emp = new PartTimeEmp("Ayoub", 30);
        double sal = emp.calculateSalary(30);
        System.out.println(sal);


    }
}