import java.util.Objects;

public class Blanket implements iBedCover {
    private final String color;
    public String getALookBehindOf(Person p) {
        return p.getName() + " выглядывает из-под одеяла.";
    }

    
    public Blanket(String color){
        this.color = color;
    }
    public Blanket(){
        this.color = "Turquoise";
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Blanket{" +
                "color='" + color + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blanket blanket = (Blanket) o;
        return Objects.equals(color, blanket.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
