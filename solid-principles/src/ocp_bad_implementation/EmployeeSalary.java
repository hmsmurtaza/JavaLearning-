package ocp_bad_implementation;

import srp_good_implementation.Employee;
// Below Employee class calculates salary based on the employee type: Permanent and Contract
// Issue: In the future, if a new type(Part-time Employee) comes then the ocde needs to be modified
// to calculate the salary based on employee type

public class EmployeeSalary {
    public long calculateSalary(Employee employee) {
        Long salary = null;

        /*if (employee.getType().equals("PERMANENT")) {
            salary = (totalWorkingDay * basicPay) + getCompanyBenefits() + getBonus();
        } else if (employee.getType().equals("CONTRACT")) {
            salary = (totalWorkingDay * basicPay);
        }*/
        return salary;
    }
}
