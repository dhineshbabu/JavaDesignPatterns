package structuralpatterns.decorator;

public class Test {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza.bake();

        Pizza pizza1 = new VeggiePizzaDecorator(pizza);
        pizza1.bake();

        Pizza pizza2 = new CheesePizza(pizza1);
        pizza2.bake();
    }
}
