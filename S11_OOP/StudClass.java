import java.util.Scanner;

class Prac {
    public int RollNo;
    public String name;
    public String Course;
    public int m1, m2, m3;

    int total() {
        return m1 + m2 + m3;
    }

    int Avg() {
        return total() / 3;
    }

    char Grade() {
        if (Avg() > 80) {
            return 'A';
        } else if (Avg() > 60 && Avg() <= 80) {
            return 'B';
        } else if (Avg() > 40 && Avg() <= 60) {

            return 'C';
        } else {
            return 'f';
        }
    }
}

public class StudClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Prac[] p = new Prac[4];
        // or Prac[]
        for (int j = 0; j < p.length; j++) {
            p[j] = new Prac();
            System.out.println("Enter Name:");
            p[j].name = s.nextLine();
            System.out.println("Enter Course:");
            p[j].Course = s.nextLine();
            System.out.println("Enter Roll number:");
            p[j].RollNo = s.nextInt();
            System.out.println("Enter the marks:");

            p[j].m1 = s.nextInt();
            p[j].m2 = s.nextInt();
            p[j].m3 = s.nextInt();
            s.nextLine();
            System.out.println("Total=" + p[j].total());
            System.out.println("Percentage=" + p[j].Avg());
            System.out.println("Grade is=" + p[j].Grade());
        }
        s.close();
    }
}
