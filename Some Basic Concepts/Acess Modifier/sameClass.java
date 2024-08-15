
//package Some Basic Concepts.Acess Modifier;
import java.util.Scanner;

class tsud {
    public int a = 3;
    protected int b = 4;
    int c = 6;
    private int d = 9;

    public void meth1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

}

public class sameClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        tsud t = new tsud();
        t.meth1();

    }

}
