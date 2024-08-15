Zimport java.util.Scanner;

public class ArithOperation {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int a = A.nextInt();
        int b = A.nextInt();

        System.out.println("Enter the operation:");
        String opr = A.next();

        switch (opr) {
            case "ADD":
                System.out.println("Addition is:" + (a + b));
                break;

            case "SUB":
                System.out.println("Subtraction is:" + (a - b));
                break;

            case "MUL":
                System.out.println("Multiplication is:" + (a * b));
                break;

            case "DIV":
                System.out.println("Division is:" + (a / b));
                break;

            case "MOD":
                System.out.println("Modulo is:" + (a % b));
                break;
        }
    }
}
