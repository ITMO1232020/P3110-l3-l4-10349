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

    public String toString() {
        return getName();
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}