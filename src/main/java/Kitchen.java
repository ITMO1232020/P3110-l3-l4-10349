public class Kitchen extends Room implements iKitchen {
    private String smell = null;
    public Kitchen() {
        super();
    }

    public Kitchen(Person p) {
        super(p);
    }

    public Kitchen(Person... people) {
        super(people);
    }


    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getSmell(){
        return smell;
    }
}
