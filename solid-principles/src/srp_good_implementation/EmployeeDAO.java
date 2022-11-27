package srp_good_implementation;

public class EmployeeDAO {
    // ...

    // data persistence logic
    public String saveEmployee(Employee employee) {
        System.out.println("in EmployeeDAO::saveEmployee()");
        return employee.getFullName();
    }
    public void updateEmployee(Employee employee) {
        System.out.println("in EmployeeDAO::updateEmployee()");
    }
}
