import java.util.Scanner;

public class Area {

    public static int Rec(int l, int b) {
        return l * b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of length and Breadth");
        int length = s.nextInt();
        int breadth = s.nextInt();
        System.out.println(Rec(length, breadth));

    }
}
