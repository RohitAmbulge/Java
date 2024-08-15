class parent {
    parent() {
        System.out.println("Default of parent");
    }

    parent(int r) {
        System.out.println("parameterized of parent" + r);
    }

}

class child extends parent {
    child() {
        System.out.println("Default of child");
    }

    child(int a) {

        System.out.println("parameterized of child" + a);
    }

    child(int a, int b) {
        super(a);
        System.out.println("2parameterized of child" + b);
    }
}

public class parameterizedConst {
    public static void main(String[] args) {
        child s = new child(2, 3);
    }

}
