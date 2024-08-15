public class throwAndThrows {

    static void Area(int h, int b) throws Exception {
        if (h < 0 || b < 0) {
            throw new Exception();
        }
        System.out.println("Area is:" + 0.5 * (h * b));
    }

    static void meth3() throws Exception {
        Area(-2, 3);
    }

    public static void main(String[] args) {
        try {
            meth3();
        } catch (Exception e) {
            System.out.println("Please enter +ve values" + e);

        }

    }

}
