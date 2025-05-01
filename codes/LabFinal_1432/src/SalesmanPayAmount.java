public class SalesmanPayAmount implements PayAmount{
    private Employee employee;

    public SalesmanPayAmount(Employee employee) {
        this.employee = employee;
    }

    @Override
    public double calculateAmount() {
        return employee.getSalaryInfo().getMonthlySalary()+employee.getSalaryInfo().getCommission();
    }
}
