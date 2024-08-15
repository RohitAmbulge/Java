
import java.util.Scanner;

public class TypeOfWebsite {

    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.println("Enter any URL:");
        String web = w.nextLine();

        if (web.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (web.endsWith(".org")) {
            System.out.println("Organizational Website");

        } else if (web.endsWith(".net")) {
            System.out.println("Network");

        } else if (web.endsWith(".gov")) {
            System.out.println("Governments Website");

        }

    }

}
