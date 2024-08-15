//package S5_operators&Expression.java;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int base, height, Area;

        System.out.println("Enter the value of basse and heigth:");
        base = a.nextInt();
        height = a.nextInt();

        // Area = (base * height) / 2;

        System.out.println("Area of Triangle is:" + (float) (base * height) / 2);
    }

}
