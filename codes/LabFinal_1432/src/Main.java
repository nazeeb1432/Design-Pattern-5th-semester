//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee manager=new Employee("john",new SalaryInfo(20000,5000,2500));
        PayAmount managerPay=new ManagerPayAmount(manager);
        System.out.println("Total pay of "+manager.getName()+" is "+managerPay.calculateAmount());


        Employee salesman=new Employee("Bob",new SalaryInfo(10000,2500,1500));
        PayAmount salesmanPay=new SalesmanPayAmount(salesman);
        System.out.println("Total pay of "+salesman.getName()+" is "+salesmanPay.calculateAmount());



        Employee engineer=new Employee("jack",new SalaryInfo(15000,3000,2000));
        PayAmount engineerPay=new EngineerPayAmount(engineer);
        System.out.println("Total pay of "+engineer.getName()+" is "+engineerPay.calculateAmount());

    }
}