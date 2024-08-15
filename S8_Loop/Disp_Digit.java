import java.util.Scanner;

public class Disp_Digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Any number:");
        int num = s.nextInt();
        int Rem;

        while (num != 0) {
            Rem = num % 10;
            num = num / 10;

            System.out.println(Rem);
        }

    }
}