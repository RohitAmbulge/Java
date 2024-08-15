//package JAVA.S9_Array;

public class Sumof {
    public static void main(String[] args) {
        int sum = 0;
        int B[] = { 5, 6, 9, 8, 7, 2, 3 };

        for (int i = 0; i < B.length; i++) {
            sum = sum + B[i];
        }
        System.out.println("Sum is:" + sum);

        for (int z : B) {
            sum = sum + z;
        }
        System.out.println("Sum is:" + sum);

    }

}
