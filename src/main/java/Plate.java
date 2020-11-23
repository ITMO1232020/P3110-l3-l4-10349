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
}
