package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * In this class tests the cocktail class
 */

@DisplayName("Testing Cocktail implementation")

public class CocktailTest {
    private Cocktail cocktail1,cocktail2, cocktail3;
    private ArrayList<Liquid> liquidList1, liquidList2, liquidList3;

    /**
     * inits three cocktails and three ArrayLists
     */
    @Test
    @BeforeEach
    void setup() {
        // SETUP PHASE
        liquidList1 = new ArrayList<>();
        liquidList1.add(new Liquid("Tequilla",0.04,40));
        liquidList1.add(new Liquid("Orange juice",0.11,0));
        liquidList1.add(new Liquid("Lemon juice",0.01,0));
        cocktail1 = new Cocktail("Tequila Sunrise", Cocktail.Color.red, liquidList1);

        liquidList2 = new ArrayList<>();
        liquidList2.add(new Liquid("Absinth",1,91));
        cocktail2 = new Cocktail("Poison", Cocktail.Color.green, liquidList2);

        liquidList3 = new ArrayList<>();
        liquidList3.add(new Liquid("Luft",0,0));
        cocktail3 = new Cocktail("Poison", Cocktail.Color.clear, liquidList3);

    }

    /**
     * Tests the Constructor of an alcoholic Cocktail
     */
    @Test
    @DisplayName("Testing constructor Cocktail")
    public void testConstructorAlcohol(){
        assertEquals(cocktail1.getCocktailColor(), Cocktail.Color.red);
        assertEquals(cocktail1.getName(),"Tequila Sunrise");
        assertEquals(cocktail1.getLiquidList(), liquidList1);
        assertEquals(cocktail1.listToString(),"Tequilla0.0440.0Orange juice0.110.0Lemon juice0.010.0");
    }

    /**
     * Tests the calculateVolume method of a Cocktail
     */
    @Test
    @DisplayName("Testing calculate volume")
    public void testCalculateVolume(){
        assertEquals(cocktail1.getVolume(),0.16);
    }

    /**
     * Tests the calculateAlcoholPercent method of a Cocktail
     */
    @Test
    @DisplayName("Testing calculate alcohol percent")
    public void testCalculateAlcoholPercent(){
        assertEquals(cocktail1.getAlcoholPercent(),10);
        assertEquals(cocktail3.getAlcoholPercent(), 0);

    }

    /**
     * Tests the setter of the Cocktails color
     */
    @Test
    @DisplayName("Testing setter of Cocktail color")
    public void testSetCocktailColor(){
        cocktail1.setCocktailColor(Cocktail.Color.blue);
        assertEquals(cocktail1.getCocktailColor(), Cocktail.Color.blue);
    }

    /**
     * Tests the setter of the Liquid list of a Cocktail
     */
    @Test
    @DisplayName("Testing setter of Liquid list")
    public void testSetLiquidList(){
        cocktail1.setLiquidList(liquidList1);
        assertEquals(cocktail1.getLiquidList(), liquidList1);

    }

    /**
     * Tests the drink method of a Cocktail
     * @throws IllegalArgumentException
     * @throws DisinfectantException
     */
    @Test
    @DisplayName("Testing drink")
    public void testDrink() throws IllegalArgumentException, DisinfectantException {
        cocktail1.drink(0.1);
        assertEquals(cocktail1.getVolume(),0.06,0.0001);
        assertDoesNotThrow(()->{cocktail1.drink(0);}, "No exception should be thrown");
        assertThrows(IllegalArgumentException.class, ()->{cocktail1.drink(-1);}, "You cannot drink a negative amount!!!");
        assertThrows(IllegalArgumentException.class, ()->{cocktail1.drink(0.5);}, "You cannot drink more than what is in your cup!!! :-)");
        assertThrows(DisinfectantException.class, ()->{cocktail2.drink(0.5);},"User died!!! :(");
        assertDoesNotThrow(()->{cocktail1.drink(0.01);}, "No exception should be thrown");
    }

    /**
     * Tests isAlcohol method of a Cocktail
     */

    @Test
    @DisplayName("Testing isAlcoholic method")
    public void testIsAlcoholic(){
        assertEquals(cocktail1.isAlcoholic(), true);
        assertEquals(cocktail3.isAlcoholic(), false);
    }

}