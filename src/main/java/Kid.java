public class Kid extends Person {
    public Kid(){
        super("Малыш");
    }
    public Kid(String name){
        super(name);
    }
    public Kid(String name, FacialExpression expression){
        super(name,expression);
    }
}