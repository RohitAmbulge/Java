import java.util.Scanner;

public class Adding {

    public void Add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Adding ad = new Adding();

        System.out.println("Enter any two integers");

        int x = s.nextInt();
        int y = s.nextInt();

        ad.Add(x, y);
    }

}
