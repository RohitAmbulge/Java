import java.util.*;

public class ReadKeyboard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b, sum;

        System.out.println("Enter two no:");
        a = s.nextInt();
        b = s.nextInt();

        sum = a + b;

        System.out.println("Sum is : " + sum);
    }
}
