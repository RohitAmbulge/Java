
interface Test {
    public void meth1();

    public void meth2();

    final static int x = 10;

    public static void meth3() {
        System.out.println("Hello Everyone");
    }

    default void meth4() {
        System.out.println("meth4 of Test");
    }
}

interface Test2 extends Test {
    public void meth5();

}

class Test3 implements Test2 {

    public void meth1() {
        System.out.println("meth1 of Test");
    }

    public void meth2() {
        System.out.println("meth2 of Test");
    }

    public void meth5() {
        System.out.println("meth3 of Test2");
    }
}

public class lastInterface {
    public static void main(String[] args) {
        System.out.println(Test.x);
        Test.meth3();

        Test3 t = new Test3();
        t.meth1();
        t.meth2();
        t.meth4();
        t.meth5();
    }
}