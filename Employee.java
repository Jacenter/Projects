package labpackage;

public abstract class Employee extends Person {
    public String hireDate;

    public Employee(String name, String hireDate) {
        super(name);
        this.hireDate = hireDate;


    }


    public String printBadge() {
        System.out.println("Name: " + name);
        System.out.println("Type of employee : " + this.getClass().getSimpleName());
        System.out.println("HireDate : " + hireDate);

        return "";
    }

    }



