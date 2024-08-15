
class Triangle {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void Area() {
        System.out.println("Area of triangle is:" + base * height);
    }

    public Triangle(int base2) {
        base = base2;
    }
}

class Square extends Triangle {

    public Square(int base) {
        super(base);

    }

    public void Area() {
        System.out.println("Area of Square is:" + base * base);
    }

}

public class EvaluationQues {

}
