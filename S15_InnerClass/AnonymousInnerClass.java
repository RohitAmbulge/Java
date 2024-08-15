abstract class My {
    abstract public void show();
}

class Outer {
    public void Display() {
        // My m = new My() {
        // public void show() {
        // System.out.println("Hey Buddy!!");
        // }
        // };
        // m.show();

        new My() {
            public void show() {
                System.out.println("Hey Buddy!!");
            }
        }.show();
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.Display();
    }

}
