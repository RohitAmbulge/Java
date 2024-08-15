public class Try {
    public static void main(String[] args) {
        meth1();
    }

    public static void meth1() {
        meth2(5, 0);

    }

    public static void meth2(int a, int b) {

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero");

        }

    }
}
