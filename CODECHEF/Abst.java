import java.util.Scanner;

abstract class Shape {
    public Shape() {
        System.out.println("Constructor");
    }

    abstract void Area();

    abstract void Peri();

}

class Rec extends Shape {
    private int length;
    private int breadth;

    public Rec(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void Area() {
        System.out.println("Area of Rectangle is :" + (length * breadth));
    }

    public void Peri() {
        System.out.println("Perimeter of the Recatngle is:" + 2 * (length + breadth));
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void Area() {
        System.out.println("Area of circle is:" + (3.142 * radius * radius));
    }

    public void Peri() {
        System.out.println("Perimetr is:" + (2 * 3.142 * radius));
    }

}

public class Abst {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of length and breadth:");
        Rec r = new Rec(s.nextInt(), s.nextInt());
        System.out.println("Enter the value of radius:");
        Circle c = new Circle(s.nextInt());
        r.Area();
        r.Peri();
        c.Area();
        c.Peri();

    }
}
