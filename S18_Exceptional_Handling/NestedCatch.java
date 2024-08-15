public class NestedCatch {
    public static void main(String[] args) {
        int A[] = { 2, 8, 4, 6, 0, 9 };

        // try {
        // int c = A[5] / A[4];
        // System.out.println("Result is:" + c);

        // try {
        // System.out.println(A[2]);
        // }

        // catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Invalid Index");

        // }
        // }

        // catch (ArithmeticException e) {
        // System.out.println("Denominator should not be zero");
        // }

        // System.out.println("Hello Everyone");

        try {
            int c = A[2] / A[4];
            System.out.println(c);

            try {
                System.out.println(A[9]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);

            }
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        finally {
            System.out.println("hello everyone");

        }

    }

}
