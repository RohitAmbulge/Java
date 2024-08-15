/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Ra {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of t");
        int t = s.nextInt();
        int count = 0;

        while (t-- > 0) {
            System.out.println("Enter the value of n , a and b");
            int n = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            int c;

            for (int i = n; i >= 1; n = n / 2) {
                count++;

            }
            c = count - 1;

            System.out.println((count * a) + (c * b));

        }

    }
}
