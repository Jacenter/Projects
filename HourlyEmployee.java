package labpackage;

public class HourlyEmployee extends Employee implements IPayable {

    public HourlyEmployee(String name, String hireDate, double hourlyRate, double hoursWorked) {
        super(name, hireDate);
        HourlyEmployee.this.setPaymentAmount(hourlyRate * hoursWorked);
    }

    @Override
    public double calculatePay() {
        return getPaymentAmount();
    }
}