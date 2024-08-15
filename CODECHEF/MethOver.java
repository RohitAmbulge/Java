
import java.util.Scanner;

class Triangle {
    private int x;
    private int y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void area() {
        double a = 0.5 * x * y;
        System.out.println("Area of Triangle is: " + a);
    }
}

class Square extends Triangle {
    public void area() {
        int a = getX() * getX();
        System.out.println("Area of Square: " + a);
    }
}

public class MethOver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();

        Triangle t = new Triangle();
        t.set(x, y);
        t.area();

        Square s = new Square();
        s.set(x, x);
        s.area();
    }
}
