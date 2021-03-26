package labpackage;


public class SalariedEmployee extends Employee implements IPayable{
    public SalariedEmployee(String name, String hireDate, double salary) {
        super(name, hireDate);
        salary = 1000.00;
        SalariedEmployee.this.setPaymentAmount(salary);
    }

    @Override
    public double calculatePay() {
        return getPaymentAmount();
    }
}



