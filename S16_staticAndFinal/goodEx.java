import java.util.Scanner;

class student {
    int rollNo;
    String Name;
    static String college = "SGGS Nanded";

    public student(int r, String N) {
        rollNo = r;
        Name = N;
    }

    static void change() {
        college = "GMC Nanded";
    }

    public void Display() {
        System.out.println(rollNo + " " + Name + " " + college);
    }
}

public class goodEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = s.nextInt();
        // System.out.println("Enter roll no and Name");
        // student d[i] = new student[n](s.nextInt(), s.next());
        student st[] = new student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the roll no and name of the  student");
            st[i] = new student(s.nextInt(), s.next());
            st[i].change();
            st[i].Display();

        }

    }

}
