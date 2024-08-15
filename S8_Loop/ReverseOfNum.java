import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Any number:");
        int num = s.nextInt();
        int Rem, rev = 0;

        while (num != 0) {
            Rem = num % 10;
            num = num / 10;
            rev = rev * 10 + Rem;
            // System.out.println(Rem);
        }
        System.out.println(rev);

    }
}
