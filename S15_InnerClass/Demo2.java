class Outer {
    // int x=10; ---> you can access static member also
    static int x = 10;
    Inner i = new Inner();

    class Inner {
        int y = 20;

        void innerDisplay() {
            System.out.println(x);
            System.out.println(y);
        }
    }

    public void outerDisplay() {
        // Inner i = new Inner();
        System.out.println(i.y);
        i.innerDisplay();
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();

        Outer.Inner oi = new Outer().new Inner(); // you can acess inner class directly
        oi.innerDisplay();

    }
}