import java.util.Objects;

public class Engine {
    private static boolean hasButton = true;
    private boolean started = false;

    public boolean isStarted(Engine engine){
        return engine.started;
    }

    public void start(Engine e){
        e.started = true;
    }

    public String start() {
        started = true;
        return "Двигатель запущен";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return started == engine.started;
    }

    public int hashCode() {
        return Objects.hash(started);
    }

    public String toString() {
        return "Engine{" +
                "started=" + started +
                '}';
    }

    public static class StaticButtonChecker{
        public boolean launchable(){
            return hasButton;
        }
    }

    public class NonStaticButtonChecker{
        public boolean launchable(){
            return hasButton;
        }
    }

}