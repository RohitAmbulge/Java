public class NestedLoop3 {

    public static void main(String[] args) {

        int i, j;
        // int count = 0;

        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= 0; j--) {
                // count++;
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println("");
        }

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                // count++;
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println("");
        }
    }

}
