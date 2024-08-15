import java.util.Scanner;

class Base {
    public void display() {
        System.out.println("Hello World");
    }
}

class sub extends Base {
    public void display() {
        System.out.println("Hello Rohit");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Base b = new Base();
        b.display();

        sub su = new sub();
        su.display();

    }

}
