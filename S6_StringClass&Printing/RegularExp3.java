public class RegularExp3 {

    public static void main(String[] args) {
        String str1 = "7";
        String str = "@";
        String str3 = "h2";

        System.out.println(str1.matches("\\d"));// for digits
        System.out.println(str.matches("\\D"));// not digit
        System.out.println(str3.matches("\\w"));// Alphabets or digits
        System.out.println(str3.matches("\\s"));// for space
        System.out.println(str.matches("\\S"));// not space
    }

}
