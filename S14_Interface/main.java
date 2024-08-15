interface polygon {
    void getArea(int length, int breadth);
}

class Rectangle implements polygon {
    public void getArea(int length, int breadth) {
        System.out.println(length * breadth);
    }
}

public class main {
    public static void main(String[] args) {
        polygon p = new Rectangle();
        p.getArea(1, 2);
    }

}
