abstract class Shape {
    public Shape() {
        System.out.println("Shape Constructor");
    }

    abstract public void Area();

    abstract public void Peri();
}

class Rectangle extends Shape {
    public int length;
    public int breadth;

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public void Area() {
        System.out.println(length * breadth);
    }

    public void Peri() {
        System.out.println(2 * (length + breadth));
    }
}

class Circle extends Shape {
    public int radius;

    public Circle(int r) {
        radius = r;
    }

    public void Area() {
        System.out.println(Math.PI * radius * radius);
    }

    public void Peri() {
        System.out.println(2 * Math.PI * radius);
    }
}

public class shapeAbstract {
    public static void main(String[] args) {
        Shape r = new Rectangle(2, 3);
        r.Area();
        r.Peri();

        Shape c = new Circle(4);
        c.Area();
        c.Peri();

    }
}