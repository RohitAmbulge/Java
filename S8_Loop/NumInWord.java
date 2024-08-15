import java.util.Scanner;

public class NumInWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = s.nextInt();

        int rev;
        String str = "";

        while (n > 0) {
            rev = n % 10;
            n = n / 10;
            str = str + rev;

        }

        System.out.println(str);
    }
}