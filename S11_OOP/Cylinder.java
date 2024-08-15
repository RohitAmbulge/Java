import java.util.Scanner;

class Clcylinder {
    public float radius;
    public float height;

    public double Area() {
        return 2 * 3.14 * radius * height;
    }

    public double Volume() {
        return 3.14 * radius * radius * height;
    }
}

public class Cylinder {

    public static void main(String[] args) {
        Clcylinder c = new Clcylinder();
        Clcylinder c2 = new Clcylinder();

        c2.radius = 1;
        c2.height = 2;

        c.radius = 2;
        c.height = 3;

        System.out.println("Area is:" + c.Area());
        System.out.println("Volume is:" + c2.Volume());
    }

}
