package core;

public class FourCheesePepperoniPizza extends PizzaTemplate {

    public String getName() {
        return "Pepperoni Pizza with four different cheeses";
    }

    protected void addIngredients() {
        System.out.println("Main ingredients");
        System.out.println("\tAdd salami");
        System.out.println("\tAdd pork and beef mixed together");
        System.out.println("\tAdd paprika or other chili pepper");
    }

    protected void addCheese() {
        System.out.println("Cheese");
        System.out.println("\tAdd gorgonzola");
        System.out.println("\tAdd Locatelli Romano Cheese");
        System.out.println("\tAdd mozzarella");
        System.out.println("\tAdd cheddar");
    }
}
