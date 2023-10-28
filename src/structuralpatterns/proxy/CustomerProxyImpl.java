package structuralpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer{

    CustomerImpl customer = new CustomerImpl();

    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        Order order1 = new Order();
        order1.setId(1);
        order1.setQuantity(100);
        order1.setProductName("Macbook");
        orders.add(order1);

        Order order2 = new Order();
        order2.setId(2);
        order2.setQuantity(1200);
        order2.setProductName("Iphone");
        orders.add(order2);
        return orders;
    }
}
