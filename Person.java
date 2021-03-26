package labpackage;

import java.util.Comparator;

public abstract class Person {
    protected String name;
    private Double paymentAmount;

    public Person(String name) {
        this.name = name;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}