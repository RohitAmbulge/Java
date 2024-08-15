class Test {
    static {
        System.out.println("Block1");
    }

    static {
        System.out.println("Block2");
    }

}

public class block {
    // static {
    // System.out.println("Block1");
    // }

    public static void main(String[] args) {

        System.out.println("Main");
        Test t = new Test();

    }

    // static {
    // System.out.println("Block2");
    // }

}