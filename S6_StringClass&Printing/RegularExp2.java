public class RegularExp2 {

    public static void main(String[] args) {
        String str = "f";
        String str1 = "S";
        String str2 = "5";
        String str3 = "H";

        System.out.println(str.matches("[a-z0-9]"));

        System.out.println(str1.matches("[a-z0-9]"));
        System.out.println(str2.matches("[a-z4-9]"));
        System.out.println(str3.matches("[b-qB -P4-9]"));

        System.out.println("*********\n");
        String str4 = "f9H";
        System.out.println(str4.matches("[a-z][0-9][A-Z]"));

        String str5 = "F";
        System.out.println(str5.matches("F|H"));

        String str6 = "Abhay";
        System.out.println(str6.matches("Abhay"));

    }

}
