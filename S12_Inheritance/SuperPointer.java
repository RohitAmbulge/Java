class Rectangle {
    int length;
    int breadth;
    int x = 10;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}

class Cuboid extends Rectangle {

    int height;
    int x = 20;

    Cuboid(int length, int breadth, int h) {
        super(length, breadth);
        height = h;

    }

    void Display() {
        System.out.println(super.x);
        System.out.println(x);

    }

}

public class SuperPointer {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(1, 2, 3);
        c.Display();

    }

}
