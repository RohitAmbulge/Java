import java.util.Scanner;

class Student {
    public int roll;
    public String Name;
    public String Course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public double avg() {
        return total() / 3;
    }

    public void grade() {
        if (avg() > 70) {
            System.out.println("A");
        } else if (avg() > 60 && avg() <= 70) {
            System.out.println("B");

        } else if (avg() > 50 && avg() <= 60) {
            System.out.println("C");
        } else if (avg() > 40 && avg() <= 50) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }
    }

}

public class StrudentTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = s.nextInt();

        Student st[] = new Student[n];

        for (int i = 1; i <= n; i++) {
            st[i] = new Student();

            System.out.println("Enter the roll no of the " + i + " student:");
            st[i].roll = s.nextInt();

            System.out.println("Enter the name of the " + i + " student:");
            st[i].Name = s.nextLine();

            System.out.println("Enter the course of the student:");
            st[i].Course = s.nextLine();

            System.out.println("Enter the Marks of the " + i + " student:");
            st[i].m1 = s.nextInt();
            st[i].m2 = s.nextInt();
            st[i].m3 = s.nextInt();

            System.out.println("Toal Marks of the " + i + " student:" + st[i].total());

            System.out.println("Average Marks of the " + i + " student:" + st[i].avg());

            System.out.println("Grade of the " + i + " student:");
            st[i].grade();

        }

    }

}
