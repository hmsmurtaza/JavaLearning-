package ocp_good_implementation;

public class RunnerClass {
    /*public Long getSalary(EmployeeSalary employeeSalary) {
        return employeeSalary.calculateSalary();
    }*/
    public static void main(String[] args) {
        /*RunnerClass runnerClass = new RunnerClass();
        runnerClass.getSalary(new PermanentEmployeeSalary().calculateSalary());

        runnerClass.getSalary(new ContractEmployeeSalary().calculateSalary());*/

        ServiceClass serviceClass = new ServiceClass();
        /*serviceClass.getContractEmployeeSalary();
        serviceClass.getPermanentEmployeeSalary();
        serviceClass.getPartTimeEmployeeSalary();*/

        serviceClass.getEmployeeSalary(new ContractEmployeeSalary());
        serviceClass.getEmployeeSalary(new PermanentEmployeeSalary());
        serviceClass.getEmployeeSalary(new PartTimeEmployeeSalary());
    }
}
