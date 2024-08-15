public class RotOfArray {
    public static void main(String[] args) {
        int A[] = { 5, 3, 9, 8, 6, 7, 2 };

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(" ");

        int temp = A[0];

        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];
        }
        A[A.length - 1] = temp;

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }
}