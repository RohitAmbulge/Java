import java.util.Scanner;

public class students {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String Name;
        System.out.println("enter the numbers of students :");
        int n = s.nextInt();
        int marks = 0;
        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("enter the no of subjects of  " + +i + " students");
            int m = s.nextInt();
            System.out.println("enter the name of student :");
            String name = s.next();
            System.out.println("enter the roll no :");
            String roll = s.next();
            for (int j = 1; j <= m; j++) {
                System.out.println("enter the marks of " + "" + j + "" + " subject");
                int mi = s.nextInt();
                marks = marks + mi;

            }

            System.out.println("total marks :" + marks);
            System.out.println("avg marks :" + (float) marks / m);

        }

    }
}
