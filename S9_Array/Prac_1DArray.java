public class Prac_1DArray {
    public static void main(String[] args) {
        int A[] = new int[5];

        int B[] = { 5, 6, 9, 8, 7 };

        B[3] = 64;

        A[4] = 9;
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

        System.out.println("Length:" + A.length);

        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
        System.out.println("****************");
        for (int x : B) {
            System.out.println(x);
        }
    }
}