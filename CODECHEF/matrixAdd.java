import java.util.Scanner;

public class matrixAdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int m = s.nextInt();
        int n = s.nextInt();

        int A[][] = new int[m][n];
        int B[][] = new int[m][n];
        int C[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }

        }

        System.out.println("Addition of two matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();

        }

    }

}
