import java.util.Scanner;

public class ArrPrac {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = s.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);
        }

        // for (int x : A) {
        // System.out.println(x);
        // }
    }

}
