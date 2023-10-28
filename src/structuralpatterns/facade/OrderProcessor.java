package structuralpatterns.facade;

public class OrderProcessor {

    public boolean checkStock(String name) {
        System.out.println("Chckign Stock");
        return true;
    }

    public void placeOrder(String name, int quantity) {
        System.out.println("Order placed");
    }

    public void shipOrder(String orderId) {
        System.out.println("Order Shipped " + orderId);
    }
}
