public class RegularExp {
    public static void main(String[] args) {
        String str = "f";
        String str1 = ".";
        String str2 = "3";
        String str3 = "%";
        System.out.println(str.matches("."));
        System.out.println(str1.matches("."));
        System.out.println(str2.matches("."));
        System.out.println(str3.matches("."));

        System.out.printf("****************\n");

        String str4 = "6";
        String str5 = "i";
        String str7 = "b";
        String str8 = "i";

        System.out.println(str4.matches("[45678]"));
        System.out.println(str5.matches("[Rohit]"));
        System.out.println(str7.matches("[^Rohit]"));
        System.out.println(str8.matches("[^Rohit]"));
    }

}
