import java.util.Scanner;

public class CuboidArea {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        float length, breadth, height;
        double Area, vol;

        System.out.println("Enter the vlues of length,breadth and height:");
        length = k.nextFloat();
        breadth = k.nextFloat();
        height = k.nextFloat();

        Area = 2 * ((length * breadth) + (breadth * height) + (height * length));
        vol = (length * breadth * height);

        System.out.println("Area of cuboid is" + Area);
        System.out.println("voiume of cuboid is" + vol);

    }

}
