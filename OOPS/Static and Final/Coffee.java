class CoffeeMachine {

    private float waterqty;
    private float milkqty;
    private float sugarqty;
    private float cofeepowderqty;

    private CoffeeMachine() {
        waterqty = 50;
        milkqty = 60;
        sugarqty = 15;
        cofeepowderqty = 10;
    }

    void fillWater(float water) {
        waterqty = water;
    }

    void fillmilk(float milk) {
        milkqty = milk;
    }

    void fillsugar(float sugar) {
        sugarqty = sugar;
    }

    void fillcoffee(float cofee) {
        cofeepowderqty = cofee;
    }

    private static CoffeeMachine cf = null;

    static CoffeeMachine getCoffee() {
        if (cf == null) {
            cf = new CoffeeMachine();
        }
        return cf;
    }

    void display(){
        System.out.println(milkqty);
        System.out.println(waterqty);
        System.out.println(sugarqty);
        System.out.println(cofeepowderqty);
    }

}

public class Coffee {
    public static void main(String args[]) {
        CoffeeMachine c1 = CoffeeMachine.getCoffee();
        CoffeeMachine c2 = CoffeeMachine.getCoffee();
        CoffeeMachine c3 = CoffeeMachine.getCoffee();
        System.out.println(c1 + " " + c2 + " " + c3);
        if (c1 == c2 && c1 == c3)
            System.out.println("Same");
            c1.fillWater(100f);
            c1.display();
            c2.display();
    }
}