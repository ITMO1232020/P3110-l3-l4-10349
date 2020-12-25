import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        iBedCover bedCover = context.getBean("bedCover", iBedCover.class);
        Person resting = context.getBean("resting", Person.class);
        Bed bed = new Bed(bedCover, resting);

        if (bed.getPerson().getName().equals("Малыш")){

            System.out.println("В кровати лежит малыш.");

        }else if(bed.getPerson().getName().equals("Карлсон")){
            Mother mom = new Mother();
            Father dad = new Father();
            Kid kid = new Kid("Малыш");
            Kitchen kitchen = new Kitchen();
            Bedroom bedroom = new Bedroom();
            Pan pan = new Pan(new FoodItem(Food.MEATBALL),20);
            kitchen.setSmell("жареные мясные тефтели");
            System.out.println("скоро обед");


            Carlson carlson = new Carlson();
            carlson.getSmell(kitchen.getSmell());
            kid.hesitate();
            carlson.addCrime("Взорвал паровую машину");
            carlson.addCrime("Прожёг книжную полку");

            kid.bringFood(carlson);
            System.out.println("carlsone be like: " + carlson.getExpression().name());
            mom.handle(pan);
            mom.fry(pan.getAllFood());
            System.out.println("Мама жарит " + pan.getAllFood().toString());


            System.out.println("В кровати лежит Карлсон.");
            carlson = (Carlson) resting;
            kid.handle(new Plate(new FoodItem(Food.MEATBALL), 10 ));


            System.out.println(carlson.fly());
            if(kid.getHeldObject() instanceof Plate && ((Plate) kid.getHeldObject()).isAbleToStealFoodFrom()){
                carlson.handle(((Plate) kid.getHeldObject()).getOneFood());
            }
            Lamp lamp = new Lamp();
            bedroom.addFurniture(lamp);
            carlson.land(lamp);

            System.out.println("Щас Карлсон cъест " + carlson.getHeldObject().toString());
            String a = carlson.getHeldObject().toString();

            try {
                carlson.eatObjectInHands();
            } catch (UnedibleObjectException e) {
                if(carlson.getHeldObject() instanceof Person){
                    throw new CannibalismException("Eating people is super wrong", e);
                }
                e.printStackTrace();
                System.out.println(carlson.getName() + " выплёвывает " + carlson.getHeldObject());
                carlson.handle(null);
                a = "Ничего";
            }

            System.out.println(a + " успешно употреблён, пошло пищеварение.");
            carlson.setFacialExpression(FacialExpression.SATISFIED);
            System.out.println(carlson.fly());






            System.out.println("Конец акта.");
        }else{
            System.out.print("закончилась, не сумев начаться...");
        }

    }
}
