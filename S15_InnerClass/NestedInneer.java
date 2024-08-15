import java.util.Scanner;

class Outer {
    int x = 10;

    Inner i = new Inner();

    class Inner {
        int y = 20;

        public void Display() {
            System.out.println(x);
            System.out.println(y);
        }
    }

    public void OuterDisplay() {
        // Inner i = new Inner();
        i.Display();
    }
}

public class NestedInneer {
    public static void main(String[] args) {
        Outer o = new Outer();
        System.out.println(o.x);
        o.OuterDisplay();

        // Outer.Inner i = new Outer().new Inner();
        // i.Display();

    }
}