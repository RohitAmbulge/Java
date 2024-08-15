class TV {
    public void switchOn() {
        System.out.println("TV is switchon");
    }

    public void ChangeChanel() {
        System.out.println("TV channel changed");
    }
}

class SmartTV extends TV {

    public void switchOn() {
        System.out.println("SmartTV is switchon");
    }

    public void ChangeChanel() {
        System.out.println("SmartTV channel changed");
    }

    public void Browse() {
        System.out.println("SmartTV Browsing");
    }

}

public class overridingTv {
    public static void main(String[] args) {
        // TV s = new TV();
        // s.switchOn();
        // s.ChangeChanel();

        SmartTV s = new SmartTV();
        s.switchOn();
        s.ChangeChanel();
        s.Browse();

        TV r = new SmartTV();
        r.ChangeChanel();
        r.switchOn();
        // r.Browse();

    }
}