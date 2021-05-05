public interface OrderService {
    void add(Order order);
    void addMultiple(Order[] orders);
    void update(Order order);
    void delete(Order order);
}
