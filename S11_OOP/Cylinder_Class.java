import java.util.Scanner;

class Cylinder {
    private int radius;
    private int height;

    Cylinder(int r, int h) {
        radius = r;
        height = h;
    }

    public double Area() {
        return 2 * 3.142 * radius * height;
    }

    public double Volume() {
        return 3.142 * radius * radius * height;
    }
}

public class Cylinder_Class {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Radius and height of Cylinder");
        int a = s.nextInt();
        int b = s.nextInt();

        Cylinder c = new Cylinder(a, b);

        // Cylinder(2, 3);

        System.out.println("Enter the Radius and height of Cylinder");
        // c.r = s.nextInt();
        // c.h = s.nextInt();

        System.out.println(c.Area());
        System.out.println(c.Volume());

    }
}
