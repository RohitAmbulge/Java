
import java.util.Scanner;

public class RadixOf {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = t.nextLine();

        if (str.matches("[01]*")) {
            System.out.println("Binary");
        } else if (str.matches("[0-9]+")) {
            System.out.println("Decimal");
        } else if (str.matches("[0-9A-F]+")) {
            System.out.println("HexaDecimal");
        } else if (str.matches("[0-7]+")) {
            System.out.println("Octal Radix 8");
        } else {
            System.out.println("not number");
        }

    }

}
