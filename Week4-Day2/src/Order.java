import java.util.List;
import java.util.Optional;

public class Order {
    private int id;
    private Optional<Customer> customer;
    private String orderDate;
    private String status;
    private Optional<List<OrderItem>> orderItems;

    public Order(int id, Customer customer, String orderDate, OrderStatus status, List<OrderItem> orderItems) {
        this.id = id;
        this.customer = Optional.ofNullable(customer);
        this.orderDate = orderDate;
        this.status = status.toString();
        this.orderItems = Optional.ofNullable(orderItems);
    }
    public String getOrderStatus() {
        return status;
    }

    public Optional<List<OrderItem>> getOrderItems() {
        return orderItems;
    }

    public Optional<Customer> getCustomer() {
        return customer;
    }
}