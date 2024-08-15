import java.util.Scanner;

class Student {
    public int RollNo;
    public String Name;
    public String Course;
    public int m1, m2, m3;

    public float total() {
        return m1 + m2 + m3;
    }

    public float Avg() {
        return total() / 3;
    }

    public void Grade() {
        if (Avg() >= 70) {
            System.out.println("A");
        } else if (Avg() >= 60 && Avg() < 70) {
            System.out.println("B");
        } else if (Avg() >= 50 && Avg() < 60) {
            System.out.println("c");
        } else {
            System.out.println("Fail");
        }
    }
}

public class ClassForStudent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Student st = new Student();

        System.out.println("Enter the student's Roll no:");
        st.RollNo = s.nextInt();
        System.out.println("Enter the student's Name:");
        st.Name = s.next();
        System.out.println("Enter the student's course:");
        st.Course = s.nextLine();

        System.out.println("Enter the student's marks:");
        st.m1 = s.nextInt();
        st.m2 = s.nextInt();
        st.m3 = s.nextInt();
         
        System.out.println("Name of student" +);
        System.out.println("" +);
        System.out.println("" +);
        System.out.println("Total Marks:" + st.total());
        System.out.println("Average:" + st.Avg());
        System.out.println("Grade of the student student is:");
        st.Grade();

    }
}