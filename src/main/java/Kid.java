import java.util.Random;
public class Kid extends Person {

    public final static String IMAGINARY_DIALOGUE = "Будьте добры, пойдемте ко мне. У меня в гостях Карлсон, который живет на крыше";

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

    public boolean hesitationResult(){
      return new Random().nextBoolean();
    }
    public void bringFood(Person p){
        p.setFacialExpression(FacialExpression.SLY);
    }
}