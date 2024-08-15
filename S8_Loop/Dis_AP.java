import java.util.Scanner;

public class Dis_AP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of a");
        int a = s.nextInt();

        System.out.println("Enter the common difference:");
        int d = s.nextInt();

        System.out.println("Enter how many numbers you want:");
        int n = s.nextInt();

        for (int i = a; i < n; i = i + d) {
            System.out.println(i);
        }

    }

}