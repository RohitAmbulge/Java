public class Dis_Vargs {

    static void Dis(int... A) {

        for (int i = 0; i < A.length; i++) {
            float total;

            if (A[i] < 500) {
                total = A[i] * (10 / 100);
            } else if (A[i] >= 500 && A[i] < 1000) {
                total = A[i] * (15 / 100);
            }
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        Dis(356, 978);
    }
}
