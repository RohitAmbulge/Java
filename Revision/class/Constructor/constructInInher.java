//package Constructor;

class parent {
    public parent() {
        System.out.println("Constructor of parent");
    }
}

class child extends parent {
    public child() {
        System.out.println("Constructor of child");
    }
}

class Grandchild extends child {
    public Grandchild() {
        System.out.println("Constructor of Grandchild");
    }

}

public class constructInInher {
    public static void main(String[] args) {
        Grandchild g = new Grandchild();
    }

}
