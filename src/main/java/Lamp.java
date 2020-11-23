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
}
