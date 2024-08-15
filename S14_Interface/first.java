// package S14_Interface;
interface Test {
    void meth1();

    void meth2();
}

class test1 implements Test {
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }
}

public class first {
    public static void main(String[] args) {
        Test t = new test1();
        t.meth1();
        t.meth2();
        test1 r = new test1();
        r.meth3();
    }
}