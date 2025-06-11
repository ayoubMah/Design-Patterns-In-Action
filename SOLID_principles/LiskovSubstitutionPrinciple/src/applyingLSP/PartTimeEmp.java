package applyingLSP;

public class PartTimeEmp extends Employee implements CalculateSalary {

    public PartTimeEmp(String name, int workHours) {
        super(name, workHours);
    }

    @Override
    public double calculateSalary(int workHours) {
        return workHours * 12;
    }
}
