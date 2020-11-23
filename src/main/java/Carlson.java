public class Carlson extends Person implements iPerson{
    private Engine engine = null;

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

    public void fly(Engine engine){
        this.engine = engine;
        engine.start();
        System.out.println("Полетел!");
    }

    public void fly(){
        if (this.engine != null){
            engine.start();
            System.out.println("Полетел!");
        }
        else{
            System.out.print("Двигателя нету.");
        }
    }

    public void land(Object o){
        System.out.println("Карлсон сел на " + o.getClass().getName());
    }

    public void setFacialExpression(FacialExpression expression) {
        super.setFacialExpression(expression);
    }
}
