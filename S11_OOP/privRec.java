import java.util.Scanner;

class Rec {
    private int length;
    private int breadth;

    Rec(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int Area() {
        return length * breadth;
    }

    int peri() {
        return 2 * (length + breadth);
    }
}

public class privRec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rec r = new Rec(4, 6);
        Rec r1 = new Rec(5, 7);
        System.out.println("Area is: " + r.Area());
        System.out.println("Peremeter is: " + r.peri());
    }

}
