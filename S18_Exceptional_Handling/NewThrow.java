public class NewThrow {

    // public static void main(String[] args) {
    // try {
    // meth3();
    // } catch (Exception e) {
    // System.out.println("length and breadth should not be zero");
    // }

    // }

    // public static void meth3() throws Exception {
    // Area(3, -6);
    // }

    // static void Area(int l, int b) throws Exception {
    // if (l < 0 || b < 0) {
    // throw new Exception();
    // }
    // }

    public static void main(String[] args) {

        try {
            meth1();
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public static void meth1() throws Exception {
        // try {
        // int a = Area(-10, 5);
        // System.out.println(a);
        // } catch (Exception e) {
        // System.out.println(e);

        // }

        int a = Area(-10, 5);
        System.out.println(a);

    }

    public static int Area(int l, int b) throws Exception {
        if (l < 0 || b < 0) {
            throw new Exception("length and breadth should not be negative");
        } else {
            int a = l * b;
            return a;
        }
    }

}
