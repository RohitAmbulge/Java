//package JAVA.S9_Array;

import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A[] = { 5, 6, 9, 7, 1, 3, 2 };

        int key;
        System.out.println("Enter the Key Element:");
        key = s.nextInt();

        for (int i = 0; i < A.length; i++) {
            if (key == A[i]) {
                System.out.println("The key numbe is found at:" + i);
                System.exit(0);
            }

        }
        System.out.println("The key numbe is not found");

    }

}
