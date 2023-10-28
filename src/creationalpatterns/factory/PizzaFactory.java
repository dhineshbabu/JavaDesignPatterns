package creationalpatterns.factory;

public class PizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza p = null;

        if(type.toLowerCase().equals("cheese")) {
            p = new CheezePizza();
        } else if(type.toLowerCase().equals("chicken")) {
            p = new ChickenPizza();
        } else if(type.toLowerCase().equals("veggie")){
            p = new VeggiePizza();
        }

        return p;
    }
}
