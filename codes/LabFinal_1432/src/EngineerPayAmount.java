public class EngineerPayAmount implements PayAmount{
    private Employee employee;

    public EngineerPayAmount(Employee employee) {
        this.employee = employee;
    }

    @Override
    public double calculateAmount() {
        return employee.getSalaryInfo().getMonthlySalary();
    }
}
