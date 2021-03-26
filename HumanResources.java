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

    public ArrayList<IPayable> sortByIncome (ArrayList<IPayable> unsortedPeople){
        return unsortedPeople;
    }
}
