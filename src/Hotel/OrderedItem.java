package Hotel;

public class OrderedItem {
    private FoodItem foodItem;
    private double finalPrice;
    private int qty;
    public OrderedItem(FoodItem foodItem, int qty){
        this.foodItem = foodItem;
        this.qty = qty;
    }

    double finalFoodPrice(){
        finalPrice = foodItem.getPrice()*qty;
        return finalPrice;
    }
}
