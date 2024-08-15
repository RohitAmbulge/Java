import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // int a, b;
        // System.out.println("Enter the value of a and b");
        // a = s.nextInt();
        // b = s.nextInt();
        // int c;

        // try {

        // c = a / b;
        // System.out.println(c);

        // }

        // catch (ArithmeticException e) {
        // System.out.println("Division by Zero it can't possible");

        // }
        // System.out.println("Hello Everyone");

        System.out.println("Enter the values of a and b");
        int a = s.nextInt();
        int b = s.nextInt();

        try {
            int c = a / b;
            System.out.println(c);
        }

        catch (ArithmeticException e) {
            // System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        System.out.println("Hello Everyone");

    }

}
