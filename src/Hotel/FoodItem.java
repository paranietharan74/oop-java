package Hotel;

import java.util.List;

public class FoodItem extends MenuItems{
    List<String> ingredients;
    public FoodItem(String name, double price, List<String> ingredients){
        super(name, price);
        this.ingredients = ingredients;
    }

    public FoodItem(String name, double price, String description){
        super(name, price, description);
    }

    public FoodItem(String name, double price){
        super(name, price);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
