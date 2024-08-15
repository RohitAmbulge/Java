//package S8_Loop;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = f.nextInt();

        int pr = 1;

        for (int i = num; i > 0; i--) {

            pr = pr * i;

        }
        System.out.println(pr);

    }
}
