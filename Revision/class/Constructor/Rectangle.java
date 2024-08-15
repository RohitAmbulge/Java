
//package class.Constructor;
import java.util.Scanner;

class Rect {
    // public int length;
    // public int breadth;

    private int length;
    private int breadth;

    public Rect(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void Area() {
        System.out.println(length * breadth);
    }

    public void Perimeter() {
        System.out.println(2 * (length + breadth));
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length and breadth of Rectangle:");
        Rect r = new Rect(s.nextInt(), s.nextInt());

        r.Area();
        r.Perimeter();

    }

}
