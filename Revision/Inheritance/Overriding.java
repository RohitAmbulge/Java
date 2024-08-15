class TV {
    public void SwitchOn() {
        System.out.println("TV is switch On");
    }

    public void changeChanel() {
        System.out.println("Tv chanel changed");
    }
}

class SmartTV extends TV {
    @Override
    public void SwitchOn() {
        System.out.println("Smart TV is switch On");
    }

    @Override
    public void changeChanel() {
        System.out.println("Smart TV chanel changed");
    }

    public void Browsing() {
        System.out.println("In Smart TV we can do browsing");
    }
}

public class Overriding {
    public static void main(String[] args) {
        TV t = new SmartTV();
        t.SwitchOn();
        t.changeChanel();
        // t.Browsing();

    }
}