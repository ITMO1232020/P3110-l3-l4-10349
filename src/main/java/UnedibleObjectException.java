public class UnedibleObjectException extends RuntimeException {
    public UnedibleObjectException(){
        super("THE HANDLED OBJECT ISNT FOOD BRUH");
    }

    public UnedibleObjectException(String msg){
        super(msg);
    }
}
