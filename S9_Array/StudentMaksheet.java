import java.util.Scanner;

public class StudentMaksheet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[] marks = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        double total = calculateTotal(marks);
        double average = calculateAverage(total, numStudents);
        char grade = calculateGrade(average);

        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade);

        input.close();
    }

    public static double calculateTotal(int[] marks) {
        double total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public static double calculateAverage(double total, int numStudents) {
        return total / numStudents;
    }

    public static char calculateGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
