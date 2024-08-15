
import java.util.Scanner;

public class Recursion {

    static int Sum(int n) {
        if (n > 0)
            return n * Sum(n - 1);
        else
            return n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = s.nextInt();

        // Practice p = new Practice();
        System.out.println("Addition is:" + Sum(num));

    }

}
