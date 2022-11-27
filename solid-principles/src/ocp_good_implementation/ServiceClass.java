package ocp_good_implementation;

public class ServiceClass {
    public Long getPermanentEmployeeSalary() {
        return new PermanentEmployeeSalary().calculateSalary();
    }

    public Long getContractEmployeeSalary() {
        return new ContractEmployeeSalary().calculateSalary();
    }

    public Long getPartTimeEmployeeSalary() {
        return new PartTimeEmployeeSalary().calculateSalary();
    }

    public Long getEmployeeSalary(EmployeeSalary employeeSalary) {
        return employeeSalary.calculateSalary();
    }
}
