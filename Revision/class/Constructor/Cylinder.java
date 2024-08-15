package Constructor;

class cylClass {
    private int radius;
    private int height;

    public cylClass(int r, int h) {
        radius = r;
        height = h;
    }

    void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 0;
        }
    }

    void setHeight(int height) {
        if (radius > 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double Area() {
        return Math.PI * radius * radius * height;
    }

}

public class Cylinder {
    public static void main(String[] args) {

        cylClass c = new cylClass(1, 2);

        System.out.println(c.Area());

    }

}
