class coffeeMachine {

    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private coffeeMachine my = null;

    private coffeeMachine() {
        coffeeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;

    }

    static coffeeMachine getInstance() {
        if (my == null)
            my = new coffeeMachine();

        return my;

    }

}

public class singleton {
    public static void main(String[] args) {
        coffeeMachine m1 = coffeeMachine.getInstance();
        coffeeMachine m2 = coffeeMachine.getInstance();
        coffeeMachine m3 = coffeeMachine.getInstance();

        if (m1 == m2 && m1 == m3) {
            System.out.println("same");
        }

    }
}
