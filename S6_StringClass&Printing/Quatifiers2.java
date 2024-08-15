public class Quatifiers2 {

    public static void main(String[] args) {
        String str = "bccbbaa";
        String str1 = "rohit@gmail.com";
        System.out.println(str.matches("[abc]{3}"));// exactly 3 times
        System.out.println(str.matches("[abc]{3,7}"));// between 3 to 7 times
        System.out.println(str1.matches(".*gmail.*"));
        System.out.println(str1.matches("\\w*@gmail(.*)"));

    }

}
