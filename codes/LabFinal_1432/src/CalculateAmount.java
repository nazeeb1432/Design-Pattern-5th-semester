public class CalculateAmount {
    private PayAmount payAmount;
    private Employee employee;

    public CalculateAmount(PayAmount payAmount,Employee employee){
        this.payAmount=payAmount;
        this.employee=employee;
    }

    public double getTotalAmount(){
        return payAmount.calculateAmount();
    }
}
