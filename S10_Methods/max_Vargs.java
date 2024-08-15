public class max_Vargs {

    static int max(int... A) {
        if (A.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            int max = A[0];
            for (int i = 1; i < A.length; i++) {
                if (A[i] > max) {
                    max = A[i];
                }
                return max;
            }

        }

    }

    public static void main(String[] args) {

        System.out.println(max(5, 6, 8, 2, 3, 7));

    }

}
