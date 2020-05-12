package at.fhj.iit;

import java.util.ArrayList;

public class Cocktail extends Drink{

    /**
     * List of liquids
     */
    private ArrayList<Liquid> liquidList;
    /**
     * volume of the cocktail
     */
    private double volume;
    /**
     * alcohol percent of the cocktail
     */
    private double alcoholPercent;

    /**
     * Creates a Cocktail object with given name
     *
     * @param name name of the drink
     */
    public Cocktail(String name) {
        super(name);
    }

    /**
     * Getter of volume
     * @return volume of Cocktail
     */
    @Override
    public double getVolume() {
        return 0;
    }
    /**
     * Getter of AlcoholPercent
     * @return alcohol percent of Cocktail
     */
    @Override
    public double getAlcoholPercent() {
        return 0;
    }
    /**
     * Getter of isAlcoholic
     * @return true if Cocktails alcohol percent > 0
     */
    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
