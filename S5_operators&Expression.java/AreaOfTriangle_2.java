//package S5_operators&Expression.java;

import java.util.Scanner;

public class AreaOfTriangle_2 {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        double s, Area;

        System.out.println("Enter the value of three sides:");
        int a = r.nextInt();
        int b = r.nextInt();
        int c = r.nextInt();

        s = (a + b + c) / 2;
        Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        // Area = (s * (s - a) * (s - b) * (s - c));

        // System.out.println(Math.sqrt(Area));
        System.out.println(Area);

    }

}
