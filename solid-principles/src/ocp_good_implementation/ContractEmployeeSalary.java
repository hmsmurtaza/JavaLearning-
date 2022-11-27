package ocp_good_implementation;

public class ContractEmployeeSalary implements EmployeeSalary{
    public ContractEmployeeSalary() {
        System.out.println("in Contract");
    }

    @Override
    public Long calculateSalary() {
        return Long.valueOf(0);
    }
}
