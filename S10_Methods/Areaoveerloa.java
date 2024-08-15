public class Areaoveerloa {

    static public void Area(float length, int breadth) {
        System.out.println("The area of Rectangle is:" + length * breadth);
    }

    static public void Area(double base, double height) {
        System.out.println("The area of Rectangle is: " + base * height);
    }

    static public void Area(double radius) {
        System.out.println("The area of Circle is: " + 3.142 * radius * radius);

    }

    public static void main(String[] args) {
        // Areaoveerloa a = new Areaoveerloa();
        Area(12, 5);
        Area(2.4);
        Area(2.3, 4.5);

    }

}
