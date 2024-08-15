
abstract class Shape {
    abstract public void Area();

    abstract public void Peri();

    public int x;
}

class Circle extends Shape {
    public int r;

    public Circle(int r) {
        this.r = r;

    }

    public void Area() {
        System.out.println("Area of Circle is:" + 3.142 * r * r);
    }

    public void peri() {
        System.out.println("Perimeter of Circle is:" + 2 * 3.142 * r);
    }
}

class Rectangle extends Shape {

    public int breadth;
    public int lenght;

    // public Rectangle(int length, int breadth) {
    // this.length = length;
    // this.breadth = breadth;
    // }

    public void Area() {
        System.out.println("Area of Rectangle is:" + length * breadth);
    }

    public void peri() {
        System.out.println("Perimeter of Rectangle is:" + 2 * (length + breadth));
    }

}

public class abstractArea {
    public static void main(String[] args) {
        Rectangle re = new Rectangle();
        re.lenght = 3;
        re.breadth = 5;
        re.Area();
        re.peri();

    }

}
