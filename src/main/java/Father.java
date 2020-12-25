public class Father extends Parent implements iParent, iFather{
    private int age;
    public void promise(){
        age--;
    }

    public Father(int age) {
        this.age = age;
    }
    public Father() {
        this.age = Integer.MAX_VALUE;
    }
}
