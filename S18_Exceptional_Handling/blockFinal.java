public class blockFinal {
    public static void main(String[] args) {
        try {
            int c = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Deno");
        }

        System.out.println("Finally");

    }

}
