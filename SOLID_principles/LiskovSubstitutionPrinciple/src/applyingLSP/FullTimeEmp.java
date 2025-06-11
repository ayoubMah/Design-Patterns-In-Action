package applyingLSP;

public class FullTimeEmp extends Employee implements CalculateSalary {

    public FullTimeEmp(String name, int workHours) {
        super(name , workHours);
    }
    @Override
    public double calculateSalary(int workHours) {
        return workHours * 10;
    }
}
