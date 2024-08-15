import java.util.Scanner;

public class prac {
    public static void main(String[] args) {

        Scanner v = new Scanner(System.in);

        int sum, avg, a, b;

        System.out.println("Enter two numbers:");
        a = v.nextInt();
        b = v.nextInt();

        sum = a + b;
        avg = sum / 2;

        System.out.println("Sum is:" + sum);
        System.out.println("Average is:" + avg);

    }
}