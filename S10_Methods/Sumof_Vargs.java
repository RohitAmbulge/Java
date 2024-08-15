public class Sumof_Vargs {

    static void sumof(int... A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumof(6, 9, 7, 8, 4, 5, 6);
        sumof(1, 2, 3, 4);
    }

}
