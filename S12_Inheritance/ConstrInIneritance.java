
class parent {
    public parent() {
        System.out.println("Parent Class");
    }
}

class child extends parent {
    public child() {
        System.out.println("Child class");
    }
}

public class ConstrInIneritance {
    public static void main(String[] args) {
        child c = new child();
    }
}
