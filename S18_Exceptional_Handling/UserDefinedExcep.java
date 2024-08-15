class lowBalanceExp extends Exception {
    public String toString() {
        return "the balance should not be less than 5000";
    }
}

public class UserDefinedExcep {

    static void fun3() {
        try {
            throw new lowBalanceExp();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    static void fun2() {
        fun3();
    }

    static void fun1() {
        fun2();
    }

    public static void main(String[] args) {
        fun1();

    }

}
