package labpackage;

import java.util.ArrayList;

public class CheckCashingPlace {

    public static void main(String[] args) {

        Entrepreneur entrepreneur1 = new Entrepreneur("Phil", 2000.00);
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("John", "02-05-2019", 1000.0);
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Mike", "03-21-2012",20.0 , 20.0);


        // employee array for issuing badges
        Employee[] employeesArrayList = new Employee[] {hourlyEmployee1, salariedEmployee1};
        // array for people that are payable
        IPayable[] peopleThatArePayable = new IPayable[] {entrepreneur1, salariedEmployee1, hourlyEmployee1};
        //array for employees that are payable
        IPayable[] employeesThatArePayable = new IPayable[] {hourlyEmployee1, salariedEmployee1};
        
        HumanResources humanResources1 = new HumanResources();

        humanResources1.issueBadge(employeesArrayList); //issueBadge method on an array of employees

        System.out.println("Prior to sorting by pay..."); //print prior to sorting by pay

        humanResources1.payPeople(peopleThatArePayable); //invoke payPeople that takes array of people

        ArrayList<IPayable> unsortedPeople = new ArrayList<>(); //arrayList of payable people
        unsortedPeople.add(hourlyEmployee1); //add object to arraylist
        unsortedPeople.add(entrepreneur1);
        unsortedPeople.add(salariedEmployee1);

        System.out.println("\n"); //print out a blank line

        humanResources1.sortByIncome(unsortedPeople); //sorts unsortedpeople ArrayList by pay

        System.out.println("I freakin' killed it then take a nice lil 30 minute break once your code has been reviewed by Mikaila");




    }
}
