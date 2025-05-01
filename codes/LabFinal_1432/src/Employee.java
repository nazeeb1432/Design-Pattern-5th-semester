public class Employee {

    private String name;
    private SalaryInfo salaryInfo;

    public Employee(String name,SalaryInfo salaryInfo) {
        this.name=name;
        this.salaryInfo=salaryInfo;
    }

    public String getName() {
        return name;
    }

    public SalaryInfo getSalaryInfo() {
        return salaryInfo;
    }
}
