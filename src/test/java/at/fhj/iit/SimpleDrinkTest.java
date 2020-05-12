package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing SimpleDrink implementation")
public class SimpleDrinkTest {
    private SimpleDrink lN, lA;
    @Test
    @BeforeEach
    void setup() {
        // SETUP PHASE
        lN = new SimpleDrink("Water",new Liquid("Water",2.0,0));
        lA = new SimpleDrink("Bier",new Liquid("Bier",2.0,0));
    }


}
