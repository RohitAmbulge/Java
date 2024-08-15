
public class Zero {
    public static void main(String[] args) {

        int A[] = { 2, 3, 0, 5, 6, 7 };
        int r = A[4] / A[2];

        try {

            System.out.println(r);

            System.out.println(A[3]);
            System.out.println("Hello Everyone");

            try {
                System.out.println(A[5]);
            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out Of Bounds");

            }
        }

        catch (ArithmeticException e) {

            System.out.println(e);

        }

        System.out.println("Hey its Rohit");

    }

}
