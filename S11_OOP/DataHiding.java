import java.util.Scanner;

class Rectangle {
    private int length;
    private int breadth;

    public int Area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    void setLength(int l) {
        if (l >= 0) {
            length = l;
        } else {
            length = 0;
        }
    }

    int getLength() {
        return length;
    }

    void setBreadth(int b) {
        if (b >= 0) {
            breadth = b;
        } else {
            breadth = 0;
        }
    }

    int getBreadth() {
        return breadth;
    }

}

public class DataHiding {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Length and breadth:");
        int l = s.nextInt();
        int b = s.nextInt();
        r.setLength(l);
        r.setBreadth(b);
        System.out.println("Length is:" + r.getLength());
        System.out.println("Breadth is:" + r.getBreadth());

        System.out.println("Area is:" + r.Area());
        System.out.println("Perimeter is:" + r.perimeter());

    }

}
