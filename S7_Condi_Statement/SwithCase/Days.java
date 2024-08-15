//package SwithCase;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);

        System.out.println("Enter day:");
        int day = d.nextInt();

        switch (day) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("invalid number ");

        }

    }

}
