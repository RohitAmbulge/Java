interface Test {
    void meth1();

    void meth2();

}

class Test2 implements Test {
    public void meth1() {
        System.out.println("Ramesh Laxman Ambulge");
    }

    public void meth2() {
        System.out.println("Rohit Ramesh Ambulge");
    }

}

public class inerface {
    public static void main(String[] args) {
        Test t = new Test2();
        t.meth1();
        t.meth2();
    }

}
