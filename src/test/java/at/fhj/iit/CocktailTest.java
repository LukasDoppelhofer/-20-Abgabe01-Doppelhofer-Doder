package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testing Cocktail implementation")

public class CocktailTest {
    private Cocktail cocktail1, cocktail2;
    /**
     * inits two cocktails
     */
    @Test
    @BeforeEach
    void setup() {
        // SETUP PHASE
        ArrayList<Liquid> liquidList = new ArrayList<Liquid>();
        liquidList.add(new Liquid("Tequilla",0.04,40));
        liquidList.add(new Liquid("Orange juice",0.11,0));
        liquidList.add(new Liquid("Lemon juice",0.01,0));
        cocktail1= new Cocktail("Tequila Sunrise", Cocktail.Color.red,liquidList);
        cocktail1.setLiquidList(liquidList);
    }
    @Test
    @DisplayName("Testing constructor Cocktail")
    public void testConstructorAlcohol(){
        ArrayList<Liquid> liquidList = new ArrayList<Liquid>();
        liquidList.add(new Liquid("Tequilla",0.04,40));
        liquidList.add(new Liquid("Orange juice",0.11,0));
        liquidList.add(new Liquid("Lemon juice",0.01,0));
        assertEquals(cocktail1.getCocktailColor(), Cocktail.Color.red);
        assertEquals(cocktail1.getName(),"Tequila Sunrise");
        assertEquals(cocktail1.listToString(),"Tequilla0.0440.0Orange juice0.110.0Lemon juice0.010.0");
    }

    @Test
    @DisplayName("Testing calculate volume")
    public void testCalculateVolume(){
        assertEquals(cocktail1.getVolume(),0.16);
    }
    @Test
    @DisplayName("Testing calculate alcohol percent")
    public void testCalculateAlcoholPercent(){
        assertEquals(cocktail1.getAlcoholPercent(),10);

    }
    //@Test
   // @DisplayName("Testing drink")
    //public void testdrink(){
      //  cocktail1.drink(5);
        //assertEquals(cocktail1.drink(0);,10);

    //}

}
