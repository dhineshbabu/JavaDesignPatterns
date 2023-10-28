package creationalpatterns.factory;

public class PizzaStore {
public Pizza orderPizza(String type) {
    // Object creation will be done inside PizzaFactory
    // That should be a static method
    Pizza p = PizzaFactory.createPizza(type);
    p.prepare();
    p.bake();
    p.cut();
    return p;
}

}
