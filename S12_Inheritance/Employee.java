class Employees {
    int salary = 30000;

}

class programmer extends Employees {
    int bonus = 2000;
}

public class Employee {
    public static void main(String[] args) { 
        programmer p = new programmer();

        System.out.println(p.salary);
        System.out.println(p.bonus);

        Employees e = new Employees();
        System.out.println(e.salary);
    }

}
