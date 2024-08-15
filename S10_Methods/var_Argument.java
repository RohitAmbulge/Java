public class var_Argument {

    static void show(int x[]) {
        for (int a : x) {
            System.out.print(a + " ");
        }
    }

    static void Arshow(int a, int... x) {
        for (int b : x) {
            System.out.print(b + " ");
        }
    }

    public static void main(String[] args) {
        // show();
        // show(1);
        // System.out.println();
        // show(5, 6);
        // System.out.println();
        // show(9, 8, 4, 2);
        // System.out.println();
        show(new int[] { 5, 8, 9, 6, 1 });
        System.out.println();
        Arshow(4, 5, 6, 7, 9);
        System.out.println();
        Arshow(7);

    }

}
