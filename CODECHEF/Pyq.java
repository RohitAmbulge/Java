import java.util.Scanner;

abstract class Employee {
    public int name;
    public int paymentPerHour;

    abstract void calculateSalary();

}

class Contractor extends Employee {
    public int WorkingHr;

    public void calculateSalary() {
        System.out.println("Salary of Contractor:" + paymentPerHour * WorkingHr);
    }

}

class FullTimeEmployee extends Employee {
    public int WorkingHr;

    public void calculateSalary() {
        System.out.println("Salary of FullTimeEmployee:" + paymentPerHour * WorkingHr);
    }

}

public class Pyq {
    public static void main(String[] args) {
        Contractor e = new Contractor();
        e.paymentPerHour = 6;
        e.WorkingHr = 7;
        e.calculateSalary();

        FullTimeEmployee f = new FullTimeEmployee();
        f.paymentPerHour = 4;
        f.WorkingHr = 3;
        f.calculateSalary();
    }

}
