public class unchecked {

    public static void fun3() {

        try {
            int c = 10 / 0;
            System.out.println(c);

        }

        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static void fun2() {
        fun3();
    }

    static void fun1() {
        fun2();
    }

    public static void main(String[] args) {
        fun1();
    }

}
