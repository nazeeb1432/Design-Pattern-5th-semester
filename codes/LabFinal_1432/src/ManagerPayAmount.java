public class ManagerPayAmount implements PayAmount{
    private Employee employee;

    public ManagerPayAmount(Employee employee) {
        this.employee = employee;
    }

    @Override
    public double calculateAmount() {
        return employee.getSalaryInfo().getMonthlySalary()+employee.getSalaryInfo().getBonus();
    }
}
