class Outer {
    public void Display() {
        class inner {
            public void show() {
                System.out.println("Hello");
            }

        }

        inner i = new inner();
        i.show();
    }
};

public class Demo {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.Display();

    }
}
