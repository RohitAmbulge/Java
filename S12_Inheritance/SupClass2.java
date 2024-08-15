import java.util.Scanner;

class Empl {
    int id;
    String name;

    public Empl(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class person extends Empl {
    int salary;

    public person(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }

    void Display() {
        System.out.println(id + " " + name + " " + salary);
    }

}

public class SupClass2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = s.nextInt();
        person []p = new person[n];

       for(int i=1;i<=p.length;i++)
       {
        //p[i] = new person();
        person p[i] = new person(p[i].id,p[i].name,p[i].salary);
        System.out.println("Enter the id of employee");
        p[i].id=s.nextInt();
        System.out.println("Enter the name of employee");
        p[i].name=s.nextLine();
        System.out.println("Enter the salary of employee");
        p[i].salary=s.nextInt();

        
        
        // Emp e = new Emp(1, "Rohit");
        p[i].Display();

       }

        

    }

}
