import java.util.List;
import java.util.ArrayList;

public class collList {
    public static void main(String[] args) {
        ArrayList<Integer> li1 = new ArrayList<>(10);
        ArrayList<Integer> li2 = new ArrayList<>(List.of(30, 40, 50, 60, 70));
        li1.add(24);
        li1.add(10);
        li1.add(0, 35);

        System.out.println(li1);

        li1.addAll(3, li2);
        // System.out.println(li1); // [35, 24, 10, 30, 40, 50, 60, 70]
        li1.set(4, 100);
        // System.out.println(li1);

        // for (int i = 0; i < li1.size(); i++) { // by using for loop
        // System.out.println(li1.get(i));
        // }

        // for (Integer x : li1) {
        // System.out.println(x);
        // }

        // for (Integer x : li1) {
        // System.out.println(x);
        // }

        li1.forEach((x) -> {
            System.out.println(x);
        });

    }

}
