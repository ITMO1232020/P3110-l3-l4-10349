import java.util.Objects;

public class Plate extends KitchenWare {
    private int foodAmt;
    private final FoodItem FOOD;

    public FoodItem getOneFood(){
        if(foodAmt == 0){return new FoodItem(Food.AFRICA);}
        foodAmt--;
        return FOOD;
    }

    public Plate(FoodItem food, int foodAmt){
        this.foodAmt = foodAmt;
        this.FOOD = food;

    }
    public Plate(){
        foodAmt = 10;
        FOOD = new FoodItem(Food.MEATBALL);
    }

    public boolean isAbleToStealFoodFrom() {
        return foodAmt > 0 && FOOD != null;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plate plate = (Plate) o;
        return foodAmt == plate.foodAmt &&
                FOOD == plate.FOOD;
    }

    public int hashCode() {
        return Objects.hash(foodAmt, FOOD);
    }

    public String toString() {
        return "Plate{" +
                "foodAmt=" + foodAmt +
                ", FOOD=" + FOOD +
                '}';
    }
}
