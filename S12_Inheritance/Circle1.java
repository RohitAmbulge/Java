//package S12_Inheritance;

class Circle {
    public int radius;

    public double Area() {
        return Math.PI * radius * radius;
    }

    public double Peri() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle {
    public int height;

    public double volume() {
        return Area() * height;
    }

}

public class Circle1 {

    public static void main(String[] args) {
        // Circle c = new Circle();
        Cylinder c1 = new Cylinder();
        // c.radius = 2;
        c1.height = 3;
        c1.radius = 2;

        // System.out.println(c.Area());
        // System.out.println(c.Peri());
        System.out.println(c1.Area());
        System.out.println(c1.Peri());
        System.out.println(c1.volume());

    }

}
