import java.util.Objects;

public class KitchenWare {
    private int foodAmt;
    private final FoodItem FOOD;

    public FoodItem getOneFood(){
        if(foodAmt == 0){return new FoodItem(Food.AFRICA);}
        foodAmt--;
        return FOOD;
    }

    public FoodItem getAllFood(){
        return getOneFood();
        //anon class w/ lambda

    }

    public KitchenWare(FoodItem food, int foodAmt){
        this.foodAmt = foodAmt;
        this.FOOD = food;

    }
    public KitchenWare(){
        foodAmt = 10;
        FOOD = new FoodItem(Food.MEATBALL);
    }

    public boolean isAbleToStealFoodFrom() {
        return foodAmt > 0 && FOOD != null;
    }


}
