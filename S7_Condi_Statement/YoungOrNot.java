//package JAVA.S7_Condi_Statement;

import java.util.Scanner;

public class YoungOrNot {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);

        int age;
        System.out.println("Enter the Age:");
        age = f.nextInt();

        if (age > 15 && age < 45) {
            System.out.println("Young");
        } else if (age > 0 && age <= 15) {
            System.out.println("Child");
        } else {
            System.out.println("Old");
        }

    }

}
