final class Car {
}

class Creta extends Car {
    public void show() {
        System.out.println("creta");
    }

}

public class finalClass {
    public static void main(String[] args) {
        Creta c = new Creta();
        c.show();
    }

}
