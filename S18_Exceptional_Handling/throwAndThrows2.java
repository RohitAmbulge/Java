class NegativeDimException extends Exception {
    public String toString() {
        return "Dim of rectangle can not be negative";

    }

}

public class throwAndThrows2 {

    public static void main(String[] args) {
        try {
            meth1();

        } catch (NegativeDimException e) {
            System.out.println(e);
        }

    }

    public static void meth1() throws NegativeDimException {
        Area(-10, 5);

    }

    public static int Area(int l, int b) throws NegativeDimException {
        if (l < 0 || b < 0) {
            throw new NegativeDimException();
        } else {
            int a = l * b;
            return a;
        }
    }

}