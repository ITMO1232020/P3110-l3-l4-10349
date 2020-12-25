import java.util.Objects;

public class Tapis implements iBedCover{

    private final String color;

    public Tapis(String color){
        this.color = color;
    }
    public Tapis(){
        this.color = "Turquoise";
    }

    public String getColor() {
        return color;
    }

    public String getALookBehindOf(Person p) {
        return p.getName() + " выглядывает из-под покрывала.";
    }

    public String toString() {
        return "Tapis{" +
                "color='" + color + '\'' +
                '}';
    }

    public int hashCode() {
        return Objects.hash(color);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tapis tapis = (Tapis) o;
        return Objects.equals(color, tapis.color);
    }
}
