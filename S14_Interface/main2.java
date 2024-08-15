interface Test {
    void meth1();

    void meth2();

    int val = 3;

}

class Test2 implements Test {
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("Meth2");
    }

    public void math3()
    {
        System.out.println("Meth3")
    }

}

public class main2 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.meth1();
        t.meth2();
        t.math3();

    }

}
