class Animal {
    String color = "black";
}

class dog extends Animal {
    String color = "White";

    void display() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class SupPointer {
    public static void main(String[] args) {
        dog d = new dog();
        d.display();
    }

}
