package core;

public abstract class PizzaTemplate {

    public abstract String getName();

    public final void makePizza(){
        System.out.println(getName().toUpperCase());
        chooseBread();
        addIngredients();
        addCheese();
        preparePizza();
    }

    protected void chooseBread(){
        System.out.println("Plain pizza dough is selected and rolled out");

    };

    protected abstract void addIngredients();

    protected abstract void addCheese();

    protected void preparePizza(){
        System.out.println("Pizza is placed in oven and heated in 220°");
    };



}
