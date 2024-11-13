import java.util.Iterator;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        OrderList orderList = new OrderList();
        Customer customer1 = new Customer("123 Thanh Xuân", "K001", "Nguyễn Văn A");
        OrderLine orderLine1 = new OrderLine("Điện thoại", 2, 1500.0);
        OrderLine orderLine2 = new OrderLine("Máy tính", 5, 25.0);
        OrderLine orderLine3 = new OrderLine("Quần áo", 3, 45.0);
        Order order1 = new Order(customer1);
        order1.addLine(orderLine1);
        order1.addLine(orderLine2);
        Order order2 = new Order(customer1);
        order2.addLine(orderLine3);
        orderList.add(order1);
        orderList.add(order2);
        System.out.println("Danh sách hóa đơn:");
        Iterator<Order> it = orderList.getIterator();

        Order order;
        while(it.hasNext()) {
            order = (Order)it.next();
            System.out.println("Khách hàng: " + order.getCustomer().getName());
            System.out.println("Tổng số tiền: " + order.getTotal());
            System.out.println("---------------------------");
        }

        orderList.remove(order1);
        System.out.println("\nĐã xóa hóa đơn của " + customer1.getName());
        System.out.println("------------------------------");
        System.out.println("Danh sách hóa đơn sau khi xóa:");
        it = orderList.getIterator();

        while(it.hasNext()) {
            order = (Order)it.next();
            System.out.println("Khách hàng: " + order.getCustomer().getName());
            System.out.println("Tổng số tiền: " + order.getTotal());
            System.out.println("---------------------------");
        }

    }
}
