package labpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HumanResources {

    public void issueBadge(Employee[] employeesArray) {
        for (Employee x : employeesArray) {
            System.out.println(x.printBadge());
        }
    }

    public void printPaymentInfo(IPayable person) {
        System.out.println(person.getClass().getSimpleName() + "Should be paid : " + person.calculatePay());

    }

    public void payPeople(IPayable[] payablePeople) {
        for (IPayable z : payablePeople) {
            System.out.println(z.getClass().getSimpleName() + " Should be paid : " + z.calculatePay());
        }
    }

    public void sortByIncome(ArrayList<IPayable> unsortedPeople) {
        Collections.sort(unsortedPeople, new IncomeComparator());
        System.out.println("After sorting by pay: ");
        for (IPayable person : unsortedPeople) {
            System.out.println(person.getClass().getSimpleName() + " should be paid: " + person.calculatePay());
        }
    }
}

