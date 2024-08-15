//package S10_Methods;

public class Over_Area {

    static float Area(int l, int b) {
        return l * b;
    };

    static float Area(float r) {
        return 3.142f * r * r;
    }

    public static void main(String[] args) {
        System.out.println(Area(2, 4));
        System.out.println(Area(6f));
    }

}
