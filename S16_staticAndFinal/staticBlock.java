
public class staticBlock {

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        System.out.println("Static2");
        int c = 40;

    }

    static {
        System.out.println("Static1");

    }

}
