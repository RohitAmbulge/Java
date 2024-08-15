import java.util.Scanner;

public class Dis_Gp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = s.nextInt();
        System.out.println("Enter the difference:");
        int d = s.nextInt();
        System.out.println("Enter the numbers:");
        int num = s.nextInt();
        int t = a;

        for (int i = a; i < num; i++) {

            System.out.println(t + " ");
            t = t * d;
        }
    }
}