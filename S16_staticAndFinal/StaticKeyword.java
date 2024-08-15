
class Test {
    static int x = 10;
    int a = 3;

    static public void show() {
        System.out.println(x);
    }

    public void Display() {
        System.out.println(x + " " + a);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Test t = new Test();
        // t.Display();
        // t.show();

        Test t2 = new Test();
        // t2.Display();
        // t.show();

        t.x = 20;

        // t.Display();

        Test.show();

    }

}
