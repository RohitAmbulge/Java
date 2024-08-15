public class Incrof {

    static void incr(int a) {
        a++;
        System.out.println(a);

        // return 0;
    }

    public static void main(String[] args) {

        // Incrof i = new Incrof();

        int x = 20;

        incr(&x);
        System.out.println(x);

    }

}
