import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Anon class
        iBuildable bb = new iBuildable() {

            public boolean buildable(Object o) {

                return o instanceof Cubes;
            }
        };



        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        iBedCover bedCover = context.getBean("bedCover", iBedCover.class);
        Person resting = context.getBean("resting", Person.class);
        Bed bed = new Bed(bedCover, resting);
        Mother mom = new Mother();
        Father dad = new Father();
        Kid kid = new Kid("Малыш");
        Kitchen kitchen = new Kitchen();
        Bedroom bedroom = new Bedroom();
        Pan pan = new Pan(new FoodItem(Food.MEATBALL),20);
        kitchen.setSmell("жареные мясные тефтели");
        System.out.println("скоро обед");
        mom.handle(pan);
        System.out.println("Малыш так хочет познакомить родителей со своим другом, что думает,\nчто сказал бы это: " + "\"" + Kid.IMAGINARY_DIALOGUE + "\"" );
        Carlson carlson = new Carlson();
        //Unit-testing a Carlson's name...
        ExampleTest test = new ExampleTest();
        test.shouldCheckAllTheItemsInTheList(carlson);

        System.out.println("Малыш решился позвать Карлсона пообедать со своей семьёй - " + kid.hesitationResult());

        carlson.addCrime("Взорвал паровую машину");
        carlson.addCrime("Прожёг книжную полку");

        kid.bringFood(carlson);
        System.out.println("carlsone be like: " + carlson.getExpression().name());

        mom.fry(pan.getAllFood());
        System.out.println("Мама жарит " + pan.getAllFood().toString());




        if (bed.getPerson().getName().equals("Малыш")){

            System.out.println("В кровати лежит малыш.");

        }else if(bed.getPerson().getName().equals("Карлсон")){

            carlson = (Carlson) resting;
            System.out.println("В кровати лежит Карлсон.");
            kid.handle(new Plate(new FoodItem(Food.MEATBALL), 10 ));

            //Just for some practice and for the good deed, make some inner class instances:
            Engine.StaticButtonChecker staticButtonChecker = new Engine.StaticButtonChecker();
            Engine.NonStaticButtonChecker nonStaticButtonChecker = new Engine().new NonStaticButtonChecker();
            System.out.println(staticButtonChecker.launchable());
            System.out.println(nonStaticButtonChecker.launchable());

            System.out.println(carlson.fly());
            if(kid.getHeldObject() instanceof Plate && ((Plate) kid.getHeldObject()).isAbleToStealFoodFrom()){
                carlson.handle(((Plate) kid.getHeldObject()).getOneFood());
            }

            Lamp lamp = new Lamp();
            bedroom.addFurniture(lamp);
            carlson.land(lamp);

            System.out.println("Щас Карлсон cъест " + carlson.getHeldObject().toString());
            String a = carlson.getHeldObject().toString();

            Meal meal = new Meal();

            System.out.println(meal.eatenBy(carlson));

            carlson.setFacialExpression(FacialExpression.SATISFIED);
            System.out.println(carlson.fly());
            carlson.handle(((Plate) kid.getHeldObject()).getOneFood());
            System.out.println(meal.eatenBy(carlson));
            System.out.println("Карлсон: " + carlson.song());
            carlson.handle(((Plate) kid.getHeldObject()).getOneFood());
            System.out.println(meal.eatenBy(carlson));
            //anon class usage
            System.out.println(bb.buildable(new Cubes()));

            Table t = new Table();
            Person betan = new Person("Бетан");
            Person bosse = new Person("Боссе");
            DiningRoom diningRoom = new DiningRoom(betan, bosse, dad);
            diningRoom.setSmell("tasty");
            diningRoom.addFurniture(t);



            System.out.println("Конец акта.");
        }else{
            System.out.print("закончилась, не сумев начаться...");
        }


    }
}
