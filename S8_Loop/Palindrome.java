import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Any number:");
        int num = s.nextInt();
        int Rem, rev = 0;
        int n = num;
        while (num != 0) {
            Rem = num % 10;
            num = num / 10;
            rev = rev * 10 + Rem;
            // System.out.println(Rem);
        }
        System.out.println(rev);

        if (n == rev) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

    }
}