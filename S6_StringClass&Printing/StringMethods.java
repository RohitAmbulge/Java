public class StringMethods {

    public static void main(String[] args) {

        // String str = new String("RohitAmbulge");
        // 1
        String str = "RohitAmbulge";
        int len = str.length();
        System.out.println(len);
        // 2
        String str2 = str.toUpperCase();
        System.out.println(str2);

        str = str.toUpperCase();
        System.out.println(str);
        // 3
        String str3 = str.toLowerCase();
        System.out.println(str3);

        str = str.toLowerCase();
        System.out.println(str3);
        // 4
        String str4 = new String("   RohitAmbulge   ");
        System.out.println(str4);

        str4 = str4.trim();
        System.out.println(str4);
        String str5 = str4.trim();
        System.out.println(str5);
        // 5
        String str6 = str4.substring(6);
        System.out.println(str6);
        str4 = str4.substring(5);
        System.out.println(str4);

        String st = str.substring(3, 7);
        System.out.println(st);
        str4 = str.substring(4, 6);
        System.out.println(str4);

    }

}
