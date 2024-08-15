import java.util.Scanner;

class Rec {
    public int length;
    public int breadth;

    public Rec(int l, int b) {
        length = l;
        breadth = b;
    }

    public float Area() {
        return length * breadth;
    }

    public float Perimeter() {
        return 2 * (length + breadth);
    }

}

public class Rectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rec r = new Rec(2, 4);
        System.out.println("Enter the length:");
        r.length = sc.nextInt();
        System.out.println("Enter the breadth:");
        r.breadth = sc.nextInt();

        System.out.println("Area of Rectangle is=" + r.Area());
        System.out.println("Perimeter of Rectangle is=" + r.Perimeter());
    }

}
