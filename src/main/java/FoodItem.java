public class FoodItem {
    private final Food foodtype;
    private final FoodState foodState;

    public FoodItem(Food foodtype){
        this.foodtype = foodtype;
        foodState = FoodState.COOKED;
    }
    public FoodItem(){
        this.foodtype = Food.AFRICA;
        foodState = null;
    }

    @Override
    public String toString() {
        return foodtype.name();
    }
}
