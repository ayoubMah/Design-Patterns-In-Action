package ViolationLSP;

public class Employee {
    String name;
    int workHours;

    public Employee(String name, int workHours) {
        this.name = name;
        this.workHours = workHours;
    }

    public double calculateSalary(int workHours) {
        return workHours * 10;
    }
}

class FullTimeEmp extends Employee{

    public FullTimeEmp(String name, int workHours) {
        super(name, workHours);
    }

    @Override
    public double calculateSalary(int workHours) {
        return workHours * 8 ;
    }
}

class PartTimeEmp extends Employee{
    public PartTimeEmp(String name, int workHours) {
        super(name, workHours);
    }

    @Override
    public double calculateSalary(int workHours) {
        return workHours * 12;
    }
}