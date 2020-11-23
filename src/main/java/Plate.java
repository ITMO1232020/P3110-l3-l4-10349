import java.util.Objects;

public class Plate {
    private int foodAmt;
    private final Food FOOD;

    public Food getOneFood(){
        if(foodAmt == 0){return Food.AFRICA;}
        foodAmt--;
        return FOOD;
    }

    public Plate(Food food, int foodAmt){
        this.foodAmt = foodAmt;
        this.FOOD = food;

    }
    public Plate(){
        foodAmt = 10;
        FOOD = Food.MEATBALL;
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
