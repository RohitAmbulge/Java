//package S13_AbstractClass;

abstract class Super {
    // abstract public void meth2();

    public Super() {
        System.out.println("Constructor");
    }

    public void meth1() {
        System.out.println("Meth1");
    }

}

class sub extends Super {
    public void meth2() {
        System.out.println("meth2");
    }

}

public class Abstract {
    public static void main(String[] args) {
        Super s = new sub();
        // s.meth2();
        s.meth1();

    }
}