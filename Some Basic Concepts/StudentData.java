import java.util.Scanner;

class student {

    public int total() {

        int total = 0;
        for (int i = 0; i < M; i++) {
            return total = total + A[i];

        }

        return 0;
    }

    public int Avg() {
        double Avg = (double) total() / M;

        return 0;
    }

}

public class StudentData {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         String Name;
         String RollNO;
        int M;
     int A[] = new int[M];
        System.out.println("Enter the number of students:");
        int n = s.nextInt();
         Student[] p = new Student[n];

        for (int i = 0; i < n; i++) {
            p[i] = new Student();
            System.out.println("Enter the name of student:");
            p[i].Name = s.nextLine();
            System.out.println("Enter the Roll Number of student:");
            p[i].RollNo = s.nextInt();
            System.out.println("Enter the Number of subjects:");
            p[i].M = s.nextInt();

            System.out.println("Enter the Marks of students:");
            for(int j= 1;j<=p[i].M;j++)
            { 
                System.out.println("The mark of "+i+" student is" );
                int p[i].A[j] = s.nextInt();
            }

        }

    }
}