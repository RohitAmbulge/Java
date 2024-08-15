abstract class Super {
    public Super() {
        System.out.println("Constructor");
    }

    public void Super() {
        System.out.println("Method of super");
    }

    abstract public void meth();

}

class Sub extends Super {

    public void sub() {
        System.out.println("method1 of sub");
    }

    public void meth() {
        System.out.println("method2 of sub");
    }

}

public class Abstract {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.Super();
        s.meth();
        s.sub();

    }

}
