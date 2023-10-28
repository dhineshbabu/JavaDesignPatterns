package structuralpatterns.decorator;

public class CheesePizza extends PizzaDecorator{

    public CheesePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Adding Cheese Toppings");
    }
}
