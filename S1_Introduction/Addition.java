
//import java.long.*;
import java.util.*;

public class Addition {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        float a, c;
        int b;
        String n;
        /*
         * System.out.println("Enter no :");
         * s.useRadix(2);
         * int x = s.nextInt();
         * System.out.println(x);
         */
        System.out.println("Enter name:");
        n = s.nextLine();
        System.out.println(n);
        System.out.println("Enter two no :");
        a = s.nextFloat();
        System.out.println(a);
        b = s.nextInt();
        System.out.println(b);
        c = a % b;
        System.out.println("Sum is :" + c);

    }

}
