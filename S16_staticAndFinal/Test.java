class Hondacity {
    static int a = 20;
    int x = 5;

    static public void Display() {
        System.out.println(a);
    }

    public void show() {
        System.out.println(x + " " + a);
    }

    static double onRoadPrice(String city) {
        switch (city) {
            case "Delhi":
                return a * 4;

            case "Mumbai":
                return a * 5;
        }

        return 0;
    }
}

public class Test {
    public static void main(String[] args) {
        // Hondacity h1 = new Hondacity();
        Hondacity h2 = new Hondacity();

        // h1.Display();
        // h1.show();

        Hondacity.Display();
        Hondacity.onRoadPrice("Delhi");

    }

}
