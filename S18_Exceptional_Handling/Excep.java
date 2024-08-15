import java.util.Scanner;

public class Excep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // try {
        // int A[] = { 2, 3, 4, 0, 5, 7 };
        // int c = A[2] / A[0];
        // System.out.println(c);
        // System.out.println(A[8]);
        // System.out.println("Hey Rohit");
        // }

        // catch (ArithmeticException e) {
        // System.out.println("Denominator should not be Zero:");
        // }

        // catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Array out of Bound:" + e);
        // }

        // System.out.println("How Are you");
        int arr[] = { 1, 2, 0, 3, 4, 5 };

        try {

            int r = arr[1] / arr[0];
            System.out.println(r);
            System.out.println(arr[8]);
        }

        catch (ArithmeticException e) {
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }

}
