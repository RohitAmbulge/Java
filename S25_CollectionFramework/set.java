
import java.util.*;

class point {
    int x;
    int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + " y=" + y;
    }

    public int compareTo(Object o) {
        point p = (point) o;

        if (this.x < p.x)
            return -1;
        else if (this.x > p.x)
            return 1;
        else {
            if (this.y < p.y)
                return -1;
            else if (this.y > p.y)
                return 1;
            else
                return 0;
        }
    }

}

public class set {
    public static void main(String[] args) {
        TreeSet<point> s = new TreeSet<>();

        s.add(new point(1, 1));
        s.add(new point(5, 5));
        s.add(new point(5, 2));

        System.out.println(s);

    }

}
