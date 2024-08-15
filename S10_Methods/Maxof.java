
//package S10_Methods;
import java.util.Scanner;

public class Maxof {

    static int max(int x, int y) // Header or Signature
    {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    };

    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);
        int a, b;

        System.out.println("Enter the values of a and b");
        a = m.nextInt();
        b = m.nextInt();

        System.out.println("Maximum number is:" + max(a, b));

    }

}
