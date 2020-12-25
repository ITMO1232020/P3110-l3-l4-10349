public class Meal {
    public String eatenBy(Person p){
        String msg = p.getName() +  " успешно съел " + p.getHeldObject().toString() + ", пошло пищеварение";
        try {
            p.eatObjectInHands();
        } catch (UnedibleObjectException e) {
            if(p.getHeldObject() instanceof Person){
                throw new CannibalismException("Eating people is super wrong", e);
            }
            e.printStackTrace();
            msg = p.getName() + " выплёвывает " + p.getHeldObject();
            p.handle(null);
        }
        return msg;
    }
}
