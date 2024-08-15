//package JAVA.S19_MultiThreading;

class My extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Rohit");
            i++;
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        My m = new My();
        m.start();

        int i = 1;
        while (true) {
            System.out.println(i + "Ambulge");
            i++;
        }
    }

}
