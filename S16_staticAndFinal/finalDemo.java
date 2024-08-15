final class Test {
    public void show() {
        System.out.println("show");
    }
}

class Test2 extends Test {
    public void show() {
        System.out.println("show2");
    }
}

public class finalDemo {

    // static final float PI;

    // public finalDemo() {
    // PI = 3.142f;
    // }

    public static void main(String[] args) {
        // final float PI;
        // PI = 3.142f;
        Test t = new Test2();
        t.show();

    }

}
