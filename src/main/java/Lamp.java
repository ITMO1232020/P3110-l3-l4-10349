import java.util.Objects;

public class Lamp {
    private final String position;
    private final boolean isOn;

    public Lamp(String position, boolean state) {
        this.position = position;
        this.isOn = state;
    }

    public Lamp(){
        position = "потолок";
        isOn = false;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lamp lamp = (Lamp) o;
        return isOn == lamp.isOn &&
                Objects.equals(position, lamp.position);
    }

    public String toString() {
        return "Lamp{" +
                "position='" + position + '\'' +
                ", isOn=" + isOn +
                '}';
    }

    public int hashCode() {
        return Objects.hash(position, isOn);
    }
}
