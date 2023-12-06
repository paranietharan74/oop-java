package Hotel;

import java.util.ArrayList;
import java.util.List;

public class ManageHotel {
    private List<FoodItem> foodItems;
    private List<Customer> customers;
    private List<Order> orders;

    public ManageHotel(){
        this.foodItems = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    // Remove a food item from the menu
    public void removeFoodItem(String foodItemName) {
        for (int i = 0; i < foodItems.size(); i++) {
            if (foodItems.get(i).getName().equals(foodItemName)) {
                foodItems.remove(i);
                break;
            }
        }
    }

    // Change the price of a food item
    public void changeFoodItemPrice(String foodItemName, double newPrice) {
        for (FoodItem foodItem : foodItems) {
            if (foodItem.getName().equals(foodItemName)) {
                foodItem.setPrice(newPrice);
                break;
            }
        }
    }

    // Add a customer to the customer list
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Remove a customer from the customer list
    public void removeCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)) {
                customers.remove(i);
                break;
            }
        }
    }

    // Create a new order for a customer
    public Order createOrder(Customer customer, List<OrderedItem> orderedItems) {
        Order order = new Order(orderedItems);
        order.setCustomer(customer);
        orders.add(order);
        return order;
    }

    // Get all food items
    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    // Get all customers
    public List<Customer> getCustomers() {
        return customers;
    }

    // Get all orders
    public List<Order> getOrders() {
        return orders;
    }
}
