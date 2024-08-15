class Circle {
    public int r;

    public double Area() {
        return Math.PI * r * r;
    }

    public double Peri() {
        return 2 * Math.PI * r;
    }
}

class Cylinder extends Circle {
    public int h;

    public double volume() {
        return Math.PI * r * r * h;
    }
}

public class Cirle_inhe {
    public static void main(String[] args) {
        Circle c = new Circle();
        Cylinder cr = new Cylinder();

        cr.r = 4;
        cr.h = 2;

        System.out.println("Area is:" + cr.Area());
        System.out.println("Area is:" + cr.Peri());
        System.out.println("Area is:" + cr.Volume());

    }

}
