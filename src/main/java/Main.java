import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    /*А затем из-под одеяла выглянуло лукавое лицо Карлсона.
     Но тут он увидел в руках Малыша тарелочку и мигом нажал кнопку на животе.
     Мотор загудел, Карлсон стремительно спикировал с кровати прямо к тарелке с тефтелями.
     Он на лету схватил тефтельку, потом взвился к потолку и,
     сделав небольшой круг под лампой, с довольным видом принялся жевать.
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        iBedCover bedCover = context.getBean("bedCover", iBedCover.class);
        Person resting = context.getBean("resting", Person.class);
        Bed bed = new Bed(bedCover, resting);

        if (bed.getPerson().getName().equals("Малыш")){

            System.out.println("В кровати лежит малыш.");

        }else if(bed.getPerson().getName().equals("Карлсон")){

            Kid kid = new Kid("Малыш");
            System.out.println("В кровати лежит Карлсон.");
            Carlson carlson = (Carlson) resting;
            kid.handle(new Plate(Food.MEATBALL, 10 ));
            System.out.println(carlson.fly());
            carlson.handle(kid.getHeldObject());
            if(carlson.getHeldObject() instanceof Plate){
                carlson.handle(Food.MEATBALL);
            }
            carlson.land(new Lamp());
            carlson.eatObjectInHands();
            carlson.setFacialExpression(FacialExpression.SATISFIED);
            System.out.println("Конец акта.");

        }else{
            System.out.print("закончилась, не сумев начаться...");
        }

    }
}