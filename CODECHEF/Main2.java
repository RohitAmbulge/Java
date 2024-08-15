abstract class Super {
    public Super() {
        System.out.println("Constructor");
    }

    public void meth1() {
        System.out.println("Meth1 of Super");
    }

    abstract void meth();

}

class Sub extends Super {
    public Sub() {
        System.out.println("Sub Constructor");
    }

    public void meth() {
        System.out.println("Meth of Sub");
    }

    public void Meth2() {
        System.out.println("This is the meth of Super");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Super s = new Sub();
        s.meth();

        s.meth1();
        s.meth2();

        // Super sp = new Sub();
        // sp.meth();

    }

}
