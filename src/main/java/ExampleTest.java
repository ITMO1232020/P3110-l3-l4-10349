import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ExampleTest {
    @Test
    @DisplayName("Should check all the items in the list")
    void shouldCheckAllTheItemsInTheList(Carlson c){
        assertEquals("Карлсон",c.getName());
    }
}
