class sup {
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println(" super meth2");
    }
}

class sub extends sup {
    @Override
    public void meth2() {
        System.out.println(" sub meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }
}

public class dMeth {
    public static void main(String[] args) {
        sup s = new sub();
        s.meth1();
        s.meth2();
        // s.meth3();

    }

}
