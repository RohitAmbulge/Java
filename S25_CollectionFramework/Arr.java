//package S25_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Arr {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(10);
        final ArrayList<Integer> al2 = new ArrayList<>(List.of(40, 50, 60, 70, 80));

        al1.add(10);
        al1.add(20);
        al1.add(0, 30);
        al1.add(2, 20);
        al1.addAll(4, al2);

        System.out.println(al1);
        System.out.println(al1.contains(10));
        System.out.println(al1.indexOf(20));
        System.out.println(al1.lastIndexOf(20));
        System.out.println(al1.get(1));
        System.out.println(al1.indexOf(70));

        System.out.println(al2);
        // System.out.println(al1.contains(100));
        // System.out.println(al1.get(5)); // ------> Written the ele at the index of 5
        // System.out.println(al1.indexOf(60)); // ----> It Written the index of the
        // element
        // System.out.println(al1.lastIndexOf(20));
    }

}
