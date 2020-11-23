public class Person implements iPerson {
    private Object inHands = null;
    private FacialExpression currentEmotion = null;
    private final String name;

    public Person(){
        name = "Unnamed Character";
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, FacialExpression f){
        this.name = name;
        currentEmotion = f;
    }

    public FacialExpression getExpression() {
        return currentEmotion;
    }

    public void handle(Object object) {
        inHands = object;
    }

    public void passHeldObjectTo(Person person) {
        person.handle(inHands);
        inHands = null;
    }

    public Object getHeldObject(){
        return inHands;
    }

    public void eatObjectInHands(){
        System.out.println(this.getName() + " ест " + inHands.toString().split("@")[0]);
        inHands = null;
    }

    public String getName() {
        return name;
    }


    protected void setFacialExpression(FacialExpression expression) {
        currentEmotion = expression;
    }
}