public class Var_Argument {

    static void show(int[] x) {
        for (int a : x) {
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        // show(46, 69, 79);
        show(new int[] { 2, 4, 7, 9 });

    }

}
