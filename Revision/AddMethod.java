import java.util.Scanner;

public class AddMethod {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter any two integers:");
        int x = s.nextInt();
        int y = s.nextInt();

        // Add(x, y);

        AddMethod t = new AddMethod();
        t.Add(x, y);
    }

    void Add(int a, int b) {
        System.out.println(a + b);
    }
}