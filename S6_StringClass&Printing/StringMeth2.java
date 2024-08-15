public class StringMeth2 {
    public static void main(String[] args) {

        String str = "Mr. Thalapati Vijay";

        System.out.println(str.startsWith("mr"));
        System.out.println(str.endsWith("Vijay"));
        System.out.println(str.charAt(9));
        System.out.println(str.indexOf("a", 11));
        System.out.println(str.length());
        System.out.println(str.indexOf("?"));
        System.out.println(str.lastIndexOf("i"));

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

    }
}