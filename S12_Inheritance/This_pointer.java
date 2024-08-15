
class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void Display() {
        System.out.println("Length is:" + this.length);
        System.out.println("Breadth is:" + this.breadth);
    }
}

public class This_pointer {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3);
        r.Display();
    }

}
