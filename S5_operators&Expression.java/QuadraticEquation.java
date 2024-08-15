import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float a, b, c;

        double r1, r2;

        System.out.println("Enter the values of a,b and c:");
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();

        double Del = (b * b) - (4 * a * c);
        r1 = ((-b) + Math.sqrt(Del)) / (2 * a);
        r2 = ((-b) - Math.sqrt(Del)) / (2 * a);

        if (Del == 0) {
            System.out.printf("Unequal");
        } else if (Del > 0) {
            System.out.println("val of r1 is" + r1);
            System.out.println("val of r1 is" + r2);

        } else {
            System.out.printf("imaginary");
        }

    }

}
