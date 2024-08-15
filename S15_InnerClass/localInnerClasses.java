class Outer {
    public void Display() {
        class Inner {
            public void show() {
                System.out.println("Hello");
            }
        }

        // Inner i = new Inner();
        // i.show();

        new Inner().show();

    }
}

public class localInnerClasses {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.Display();
    }
}