
public class Quantifiers {
    public static void main(String[] args) {

        String str = "       ";
        String str1 = "RohitRameshAmbulge";
        String str2 = "1646464 ";
        String str3 = "       ";

        System.out.println(str.matches(".*"));// 0 or more times
        System.out.println(str1.matches(".*"));// 0 or more times
        System.out.println(str2.matches(".*"));// 0 or more times
        System.out.println(str3.matches(".*"));// 0 or more times

        System.out.print("***********\n");

        String str4 = "aabbcdd";
        String str5 = "ABBBCDDDEEE";
        String str6 = "4546444466400";
        System.out.println(str4.matches("[abcd]*"));// 0 or more times
        System.out.println(str4.matches("[a-z]*"));
        System.out.println(str5.matches("[ABCDE]*"));
        System.out.println(str5.matches("[A-Z]*"));
        System.out.println(str6.matches("[0-9]*"));

    }
}