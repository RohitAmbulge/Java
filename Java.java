//Use of Constructor 
class defcons {
    int c;

    defcons() {
        System.out.println("Default Constructor");

    }

    // Vro Parameterised constructor ka code dekho niche h
    defcons(int a, int b) {
        c = a + b;
        System.out.println("Addition of " + a + "+" + b + "= " + c);
    }
}

public class Java {
    public static void main(String[] args) {

        System.out.println("Constructor ");
        defcons sc = new defcons();

        defcons jav = new defcons(5, 6);
    }
}