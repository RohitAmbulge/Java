public class StringMeth3 {
    public static void main(String[] args) {

        String str1 = "ROHIT";
        String str2 = "rohit";
        String str3 = " Ramesh";
        String str4 = "Ramesh";
        String str5 = "The great wall of china";

        System.out.println(str4.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str2));
        System.out.println(str4 == str3);
        System.out.println(str4 == str2);
        System.out.println(str1.concat(str3));
        System.out.println(str5.contains("china"));

    }

}
