import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<OrderLine> orderLines;
    private double total;

    public Order(Customer customer) {
        this.customer = customer;
        this.orderLines = new ArrayList();
        this.total = 0.0;
    }

    public void addLine(OrderLine orderLine) {
        this.orderLines.add(orderLine);
        this.total += orderLine.getTotal();
    }

    public void removeLine(OrderLine orderLine) {
        if (this.orderLines.remove(orderLine)) {
            this.total -= orderLine.getTotal();
        }

    }

    public double getTotal() {
        return this.total;
    }

    public Customer getCustomer() {
        return this.customer;
    }
}
