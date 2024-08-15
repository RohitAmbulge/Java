public class ObjPassing {

    static void change(int A[], int index, int value) {
        A[index] = value;
    }

    public static void main(String[] args) {
        int B[] = { 5, 6, 3, 8, 9 };

        change(B, 3, 78);

        for (int x : B)
            System.out.println(x);
    }
}
