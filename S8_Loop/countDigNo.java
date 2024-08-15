import java.util.Scanner;

public class countDigNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Any number:");
        int num = s.nextInt();

        int count = 0;
        while (num != 0) {

            num = num / 10;
            count++;

        }
        System.out.println(count);

    }
}