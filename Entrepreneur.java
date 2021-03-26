package labpackage;

public class Entrepreneur extends Person implements IPayable{
    public double income;

    public Entrepreneur(String name, double income) {
        super(name);
        income = 2000.00;
        Entrepreneur.this.setPaymentAmount(income);
    }

    @Override
    public double calculatePay() {
        return getPaymentAmount();
    }
}