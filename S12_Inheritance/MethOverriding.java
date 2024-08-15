class Bank {
    int Display() {
        return 0;
    }
}

class SBI extends Bank {
    int Display() {
        return 7;
    }
}

class ICICI extends Bank {
    int Display() {
        return 8;
    }
}

class Axis extends Bank {
    int Display() {
        return 9;
    }
}

public class MethOverriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        System.out.println(s.Display());
        ICICI i = new ICICI();
        System.out.println(i.Display());
        Axis a = new Axis();
        System.out.println(a.Display());
    }
}
