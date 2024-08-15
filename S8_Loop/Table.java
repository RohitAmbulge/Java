//package S8_Loop;

import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number which you want:");
        int num = t.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));
        }

    }
}
