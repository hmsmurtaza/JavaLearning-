package srp_good_implementation;

public class EmployeeService {
    // business logic
    public long calculateEmployeeSalary(Employee employee) {
        System.out.println("in EmployeeService::calculateEmployeeSalary()");
        return Long.parseLong(employee.getAnnualSalary());
    }

    public long calculateEmployeeLeaves(Employee employee) {
        System.out.println("in EmployeeService::calculateEmployeeLeaves()");
        return Long.parseLong(employee.getNumberOfLeaves());
    }

    public long calculateTaxOnSalary(Employee employee) {
        System.out.println("in EmployeeService::calculateTaxOnSalary()");
        return Long.parseLong(employee.getTaxOnSalary());
    }
}
