public class Blanket implements iBedCover {
    private final String color;
    public void getALookBehindOf(Person p) {
        System.out.println(p.getName() + " выглядывает из-под одеяла.");
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
}
