package ocp_good_implementation;

// We can introduce a new interface EmployeeSalary and create
// two child classes for Permanent and Contractual Employees.
// By doing this, when a new type comes then a new child class
// needs to be created and our core logic will also not change
// from this.

/**
 * @author @hmsmurtaza
 * We can introduce a new interface EmployeeSalary and create
 * two child classes for Permanent and Contractual Employees.
 * By doing this, when a new type comes then a new child class
 * needs to be created and our core logic will also not change
 * from this.
 */
public interface EmployeeSalary {
    public Long calculateSalary();
}
