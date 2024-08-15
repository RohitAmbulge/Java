import java.util.Scanner;

public class Excep2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            int A[] = { 2, 3, 4, 0, 5, 7 };
            int c = A[2] / A[3];
            System.out.println(c);

            try {
                System.out.println(A[3]);
            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array out of Bound:" + e);
            }

            System.out.println("Hey Rohit");
        }

        catch (ArithmeticException e) {
            System.out.println("Denominator should not be Zero:");
        }

        System.out.println("How Are you");

    }

}
