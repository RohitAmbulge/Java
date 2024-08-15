import java.io.*;

public class Checked {

    public static void fun3() {
        FileInputStream fi = new FileInputStream("My.txt");

    }

    static void fun2() {
        fun3();
    }

    static void fun1() {
        fun2();
    }

    public static void main(String[] args) {
        fun1();
    }

}
