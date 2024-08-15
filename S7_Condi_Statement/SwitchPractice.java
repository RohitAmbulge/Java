import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = s.nextInt();
        System.out.println("enter any two integers");
        int a = s.nextInt();
        int b = s.nextInt();

        switch (n) {
            case 1:
                System.out.println(a + b);
                break;

            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;

            case 4:
                System.out.println(a / b);
                break;

        }
    }

}
