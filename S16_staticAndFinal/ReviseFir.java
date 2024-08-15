class HondaCity {
    static long price = 10;

    int a, b;

    static double onRoadPrice(String city) {
        switch (city) {
            case "delhi":
                return price + price * 0.1;
            case "Mumbai":
                return price + price * 0.09;
        }
        return -1;
    }

}

public class ReviseFir {
    public static void main(String[] args) {
        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();
        System.out.println(h1.price);
        System.out.println(h2.price);
        h1.price = 20;
        System.out.println(h1.onRoadPrice("delhi"));
        System.out.println(h2.price);
        System.out.println(HondaCity.price);
    }

}
