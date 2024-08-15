class Shapes {
    public void print() {
        System.out.println("Drawing....");
    }
}

class Rectangle extends Shapes {
    public void print() {
        System.out.println("Drawing Rectangle....");
    }
}

class Triangle extends Shapes {
    public void print() {
        System.out.println("Drawing Triangle....");
    }
}

class Circle extends Shapes {
    public void print() {
        System.out.println("Drawing Circle....");
    }
}

public class DynamicMemDis {
    public static void main(String[] args) {
        Shapes s;
        s = new Rectangle();
        s.print();

        s = new Triangle();
        s.print();

        s = new Circle();
        s.print();

    }

}
