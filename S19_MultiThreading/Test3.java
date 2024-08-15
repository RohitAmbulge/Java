//package JAVA.S19_MultiThreading;

public class Test3 extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hey");
            i++;
        }
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.start();
        int i = 1;
        while (true) {
            System.out.println(i + "rohit");
            i++;
        }
    }

}
