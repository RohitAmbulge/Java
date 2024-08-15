public class var_arg2 {

    static void show(String... s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        show("rohan", "Rohit", "Shreyash", "sushant");

    }

}
