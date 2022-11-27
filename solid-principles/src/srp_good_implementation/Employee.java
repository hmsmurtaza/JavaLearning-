package srp_good_implementation;
// good implementation of SRP

public class Employee {
    private String fullName;
    private String dateOfJoining;
    private String annualSalary;

    private String taxOnSalary;

    public String getTaxOnSalary() {
        return taxOnSalary;
    }

    public void setTaxOnSalary(String taxOnSalary) {
        this.taxOnSalary = taxOnSalary;
    }

    public String getNumberOfLeaves() {
        return numberOfLeaves;
    }

    public void setNumberOfLeaves(String numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    private String numberOfLeaves;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(String annualSalary) {
        this.annualSalary = annualSalary;
    }
}
