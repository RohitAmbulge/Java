import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Any number:");
        int num = s.nextInt();
        int rem, sum = 0;
        int n = num;
        while (num != 0) {

            rem = num % 10;

            num = num / 10;

            sum = sum + (rem * rem * rem);
            // count++;

        }

        System.out.println(sum);
        if (sum == n)
            System.out.println("It is Armstrong Number");
        else
            System.out.println("It is not Armstrong Number");

    }
}