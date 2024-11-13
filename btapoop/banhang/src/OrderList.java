import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderList {
    private List<Order> orders = new ArrayList();

    public OrderList() {
    }

    public void add(Order order) {
        this.orders.add(order);
    }

    public void remove(Order order) {
        this.orders.remove(order);
    }

    public int getCount() {
        return this.orders.size();
    }

    public Iterator<Order> getIterator() {
        return this.orders.iterator();
    }
}
