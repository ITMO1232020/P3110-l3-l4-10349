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

    public Person getPerson() {
        return person;
    }
}
