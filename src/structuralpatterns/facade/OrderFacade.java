package structuralpatterns.facade;

import java.util.UUID;

public class OrderFacade {
    public void processOrder(String name, int quantity) {
        OrderProcessor processor = new OrderProcessor();
        if(processor.checkStock(name)) {
            processor.placeOrder(name, quantity);
            processor.shipOrder(UUID.randomUUID().toString());
        }
    }
}
