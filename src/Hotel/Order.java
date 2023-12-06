package Hotel;

import java.util.List;

public class Order {
    protected List<OrderedItem> orderedItems;
    Customer customer;
    public Order(List<OrderedItem> orderedItems){
        this.orderedItems = orderedItems;
        this.customer = customer;
    }

    public double calculateTotal(){
        double total = 0;
        for (OrderedItem item : orderedItems){
            total += item.finalFoodPrice();
        }
        return total;
    }

    public List<OrderedItem> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(List<OrderedItem> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
