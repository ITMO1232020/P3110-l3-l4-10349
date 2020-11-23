import java.util.Objects;

public class Bed {
    private final iBedCover cover;
    private final Person person;

    public Bed(iBedCover bedCover, Person person) {
        this.cover = bedCover;
        this.person = person;
    }

    public Bed(Person person) {
        this.cover = new Blanket();
        this.person = person;
    }

    public Bed(iBedCover cover) {
        this.cover = cover;
        this.person = new Carlson();
    }

    @Override
    public String toString() {
        return "Bed{" +
                "cover=" + cover +
                ", person=" + person +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bed bed = (Bed) o;
        return Objects.equals(cover, bed.cover) &&
                Objects.equals(person, bed.person);
    }

    public int hashCode() {
        return Objects.hash(cover, person);
    }

    public Person getPerson() {
        return person;
    }
}
