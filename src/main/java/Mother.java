public class Mother extends Parent implements iMother{
    private int age;
    @Override
    public FoodItem fry(FoodItem f) {
        class Degree{
            int FryDensity;

            public Degree() {
                FryDensity = Integer.MAX_VALUE;
            }
            public FoodItem dupeFood(FoodItem f){
                return f;
            }
        }
        Degree degree = new Degree();
        return degree.dupeFood(f);
    }

    public Mother() {
        this.age = Integer.MAX_VALUE;
    }
}
