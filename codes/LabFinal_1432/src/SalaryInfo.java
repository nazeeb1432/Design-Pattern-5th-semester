public class SalaryInfo {
    private double monthlySalary;
    private double commission;
    private double bonus;

    public SalaryInfo(double monthlySalary, double commission, double bonus) {
        this.monthlySalary = monthlySalary;
        this.commission = commission;
        this.bonus = bonus;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getCommission() {
        return commission;
    }

    public double getBonus() {
        return bonus;
    }
}
