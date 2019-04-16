import core.FourCheesePepperoniPizza;
import core.MargheritaPizza;
import core.PizzaTemplate;

public class Main {
    public static void main(String[] args) {
        PizzaTemplate pizzaType = new MargheritaPizza();

        pizzaType.makePizza();

        System.out.println();
        System.out.println("************");
        System.out.println();

        pizzaType = new FourCheesePepperoniPizza();
        pizzaType.makePizza();
    }
}
