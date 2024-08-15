import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("how many numbers you want");
        int num = sc.nextInt();
        int fib;

        for (int i = 0; i < num; i++) {
            if (num == 0) {
                System.out.println("Fibonacci Series is:" + "0");
            } else if (num == 1) {
                System.out.println("Fibonacci" + "1");
            } else {
                fib = (num - 2) + (num - 1);
            }
        }
        System.out.println("Fibonacci Series is:" + fib);

    }

}
