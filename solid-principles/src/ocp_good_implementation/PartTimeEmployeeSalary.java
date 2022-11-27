package ocp_good_implementation;

public class PartTimeEmployeeSalary implements EmployeeSalary{
    public PartTimeEmployeeSalary() {
        System.out.println("in PartTimeEmployeeSalary class");
    }

    @Override
    public Long calculateSalary() {
        return Long.valueOf(0);
    }
}
