import java.util.Scanner;

class Triangle {
    private int base;
    private int height;

    public void setTriangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void Area() {
        System.out.println(0.5 * base * height);
    }
}

class Square extends Triangle {
    private int side;

    public void setSquare(int side) {
        this.side = side;

    }
    // TODO Auto-generated constructor stub

    public void Area() {
        System.out.println(side * side);
    }

}

public class Overriding {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Triangle t = new Triangle();
        Square sq = new Square();

        System.out.println("Enter the base and heighgt");
        t.setTriangle(s.nextInt(), s.nextInt());

        System.out.println("Enter the side");
        sq.setSquare(s.nextInt());

        Triangle tr = new Square();
        tr.Area();

    }

}
