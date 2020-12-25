import java.util.ArrayList;
import java.util.Arrays;

public class Room {
    ArrayList<Object> furniture = new ArrayList<Object>();
    ArrayList<Person> people = new ArrayList<Person>();

    public void addFurniture(Object o){
        furniture.add(o);
    }

    public Room(){ }

    public Room(Person p){
        people.add(p);
    }

    public Room(Person... people){
        this.people.addAll(Arrays.asList(people));
    }
}
