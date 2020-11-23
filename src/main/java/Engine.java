public class Engine {
    private boolean started = false;

    public boolean isStarted(Engine engine){
        return engine.started;
    }

    public void start(Engine e){
        e.started = true;
    }

    public void start() {
        started = true;
        System.out.println("Двигатель запущен");}
}