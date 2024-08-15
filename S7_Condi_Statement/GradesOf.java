//package JAVA.S7_Condi_Statement;

import java.util.Scanner;

public class GradesOf {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        float phy, chem, math;

        System.out.println("Enter the marks you got in physics, chemistry and math:");
        phy = m.nextFloat();
        chem = m.nextFloat();
        math = m.nextFloat();

        float sum = phy + chem + math;
        float avg = (sum / 3);

        System.out.println("Sum is:" + sum);
        System.out.println("Average is:" + avg);

        if (avg >= 70) {
            System.out.println("A");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("B");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("C");
        } else if (avg >= 40 && avg < 50) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }

    }

}
