public class Tapis implements iBedCover{

    private final String color;

    public Tapis(String color){
        this.color = color;
    }
    public Tapis(){
        this.color = "Turquoise";
    }

    public boolean equals(Object o){
        return o instanceof Tapis;
    }

    public String getColor() {
        return color;
    }

    public void getALookBehindOf(Person p) {
        System.out.println(p.getName() + " выглядывает из-под покрывала.");
    }

    public String toString(){
        return color;
    }
}
