import java.util.Scanner;

class Triangle {
    private int base;
    private int height;

    void set(int base, int height) {
        this.base = base;
        this.height = height;

    }

    int getbase() {
        return base;
    }

    int getHeight() {
        return height;
    }

    public void Area() {
        System.out.println(0.5 * base * height);

    }
}

class Square extends Triangle {
    public void Area() {
        System.out.println(0.5 * getbase() * getbase());

    }

}

public class EvalQues2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {

            Triangle t = new Triangle();
            System.out.println("Enter the base and height of triangle : ");
            t.set(s.nextInt(), s.nextInt());
            t.Area();

            Square sq = new Square();
            sq.Area();

        }
    }

}
