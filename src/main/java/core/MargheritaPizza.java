package core;

public class MargheritaPizza extends PizzaTemplate {

    public String getName() {
        return "Margarita";
    }

    protected void addIngredients() {
        System.out.println("Main ingredients");
        System.out.println("\tAdd tomatoes");
        System.out.println("\tAdd fresh basil");
        System.out.println("\tAdd salt and extra-virgin olive oil");
    }

    protected void addCheese() {
        System.out.println("Cheese");
        System.out.println("\tAdd mozzarella");
    }
}
