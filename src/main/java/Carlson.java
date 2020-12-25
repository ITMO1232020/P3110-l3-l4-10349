import java.util.ArrayList;
import java.util.Objects;

public class Carlson extends Person implements iPerson, iCriminal{
    private Engine engine;
    private final ArrayList<String> crimes = new ArrayList<>();

    public Carlson(String name, FacialExpression expression){
        super(name,expression);
        this.engine = new Engine();
    }
    public Carlson(String name){
        super(name); setFacialExpression(FacialExpression.SLY); this.engine = new Engine();
    }
    public Carlson(String name, FacialExpression expression, Engine engine){
        super(name,expression);
        this.engine = engine;
    }
    public Carlson(){
        super("Карлсон");
        this.engine = new Engine();
        setFacialExpression(FacialExpression.SLY);
    }

    public String fly(Engine engine){
        this.engine = engine;
        String a = engine.start();
        return a + '\n' + "Полетел!";
    }

    public String fly(){
        if (this.engine != null){
            engine.start();
            return "Полетел!";
        }
        else{
            return "Двигателя нету.";
        }
    }

    public ArrayList<String> getCrimes() {
        return crimes;
    }
    public void addCrime(String crime){
        crimes.add(crime);
    }

    public String land(Object o){
        return "Карлсон сел на " + o.getClass().getName();
    }

    public void setFacialExpression(FacialExpression expression) {
        super.setFacialExpression(expression);
    }

    public String toString() {
        return "Carlson{" +
                "engine=" + engine +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carlson carlson = (Carlson) o;
        return Objects.equals(engine, carlson.engine);
    }

    public int hashCode() {
        return Objects.hash(engine);
    }
}
