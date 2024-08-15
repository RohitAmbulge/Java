class Test {
    public final void show() {
        System.out.println("Hey i'm Rohit");
    }

}

class Test1 extends Test {
    public void show() {
        System.out.println("Rohit Ambulge");
    }
}

public class firstFinal {
    public static void main(String[] args) {
        Test t = new Test1();
        t.show();

    }
}