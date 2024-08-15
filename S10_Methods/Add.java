public class Add {

    int add(int x, int y) {
        int z;
        z = x + y;
        return z;
    }

    public static void main(String[] args) {
        int a = 34;
        int b = 56;
        Add y = new Add();
        // int c = add(a, b);
        System.out.println(y.add(a, b));
    }

}
