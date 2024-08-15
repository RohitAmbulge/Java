class vehicle {
    public void meth() {
        System.out.println("Vehicle is Starts.......");
    }
}

class Mustang extends vehicle {
    public void meth() {
        System.out.println("Mustang Satrts.....");
    }

}

public class overri {
    public static void main(String[] args) {
        Mustang m = new Mustang();
        m.meth();

    }

}
