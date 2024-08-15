public class StringObj {

    public static void main(String[] args) {

        String str1 = new String("Rohit");
        // String str1 = new String();
        String str2 = new String("Rohit"); // = "Java";
        // str2 = str1;

        System.out.println(str1);
        System.out.println(str2);
        // System.out.println(str1 == str2);

        char c[] = { 'A', 'B', 'C', 'D' };
        String st = new String(c);
        // System.out.printf("%s", st);
        System.out.println(st);

        byte b[] = { 65, 66, 67, 68 };
        String s = new String(b);
        System.out.println(s);

    }

}
