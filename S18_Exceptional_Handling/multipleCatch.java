public class multipleCatch {
    public static void main(String[] args) {

        int A[] = { 30, 40, 20, 10, 50, 0 };

        try {
            int c = A[4] / A[2];
            System.out.println("Division is :" + c);
            System.out.println(A[13]);
        }

        catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is Invalid");
        }

        System.out.println("Hey Buddy");

    }

}
