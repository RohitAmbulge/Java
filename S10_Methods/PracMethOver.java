import java.util.Scanner;

public class PracMethOver {

    static int Max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int Max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }

    }

    static float Max(float a, float b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        // PracMethOver p = new PracMethOver();......Use this when
        System.out.println(Max(5, 7));
        System.out.println(Max(9, 7, 5));
        System.out.println(Max(6, 5));

    }

}
