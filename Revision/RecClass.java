import java.util.Scanner;

class Rectangle {
    private int length;
    private int breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public double Area() {
        return length * breadth;
    }

    public double Peri() {
        return 2 * (length + breadth);
    }

}

public class RecClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.println("Enter the value of length:");
        r.setLength(s.nextInt());
        System.out.println("Enter the value of breadth:");
        r.setBreadth(s.nextInt());

        System.out.println("Area of Rectangle is:" + r.Area());
        System.out.println("Perimeter of Rectangle is:" + r.Peri());

    }
}