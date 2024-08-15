public class NestedLoop2 {

    public static void main(String[] args) {

        int i, j;
        int count = 0;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println("");
        }
    }

}
