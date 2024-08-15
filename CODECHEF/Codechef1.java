import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef1 {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        int max = 0;
        int k, r = 0;

        for (int i = 1; i <= t; i++) {
            int w = s.nextInt();
            int l = s.nextInt();

            k = w - l;

            if (k > max) {
                max = k;
                r = i;

            }

        }

        System.out.println(r + " " + max);

    }
}
