class phone {
    void call() {
        System.out.println("Phone used for call");
    }

    void SMS() {
        System.out.println("Phone used for SMS");
    }
}

interface iCamera {

    void click();

    void record();
}

interface musicPlayer {
    void play();

    void pause();
}

class smartPhone extends phone implements iCamera, musicPlayer {
    public void videoCall() {
        System.out.println("Smartphone is used for videocall");
    }

    public void click() {
        System.out.println("Camera for click");
    }

    public void record() {
        System.out.println("Camera for recording");
    }

    public void play() {
        System.out.println("musicplayer for play the song");
    }

    public void pause() {
        System.out.println("musicplayer for pause the song");
    }
}

public class Demo {
    public static void main(String[] args) {
        phone s = new smartPhone();
        s.SMS();
        s.call();

        iCamera c = new smartPhone();
        c.click();
        c.record();

        musicPlayer m = new smartPhone();
        m.pause();
        m.play();

    }

}
