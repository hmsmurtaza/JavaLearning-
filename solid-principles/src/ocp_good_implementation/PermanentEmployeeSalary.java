package ocp_good_implementation;

public class PermanentEmployeeSalary implements EmployeeSalary{
    @Override
    public Long calculateSalary() {
        return Long.valueOf(0);
    }
}
