class Rec {
    public int length;
    public int breadth;

    public double Area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        if (length == breadth) {
            return true;
        } else {
            return false;
        }
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Rec r = new Rec();
        r.length = 3;
        r.breadth = 2;

        System.out.println(r.Area());
        System.out.println(r.perimeter());
        System.out.println(r.isSquare());

    }
}