package at.fhj.iit;

import java.util.ArrayList;

/**
 * Class represents a cocktail that contains several liquids
 */

public class Cocktail extends Drink{

    /**
     * enum that represents the color of the cocktail
     */
    private enum Color {
        red, blue, green, yellow, clear
    }
    private Color cocktailColor;

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
     * @param liquidList list of all liquids that are in the cocktail
     */
    public Cocktail(String name, ArrayList<Liquid> liquidList, Color cocktailColor) {
        super(name);
        this.liquidList = liquidList;
        this.cocktailColor = cocktailColor;
    }

    /**
     * getter for cocktailColor
     *
     * @return cocktailColor of the cocktail
     */
    public Color getCocktailColor() {
        return cocktailColor;
    }

    /**
     * setter for cocktailColor
     *
     * @param cocktailColor new cocktailColor
     */
    public void setCocktailColor(Color cocktailColor) {
        this.cocktailColor = cocktailColor;
    }
    /**
     * getter for liquidList
     *
     * @return liquidList of the cocktail
     */

    public ArrayList<Liquid> getLiquidList() {
        return liquidList;
    }
    /**
     * setter for liquidList
     *
     * @param liquidList new liquidList
     */
    public void setLiquidList(ArrayList<Liquid> liquidList) {
        this.liquidList = liquidList;
    }
    /**
     * the following getters do not require an equivalent setter
     * because these variables are calculated
     * @param volume
     * @param alcoholPercent
     * @param isAlcoholic
     */

    /**
     * Getter of volume
     * @return volume of Cocktail
     */
    @Override
    public double getVolume() {
        return volume;
    }
    /**
     * Getter of AlcoholPercent
     * @return alcohol percent of Cocktail
     */
    @Override
    public double getAlcoholPercent() {
        return alcoholPercent;
    }
    /**
     * Getter of isAlcoholic
     * @return true if Cocktails alcohol percent > 0
     */
    @Override
    public boolean isAlcoholic() {
        if(alcoholPercent > 0){
            return true;
        } else {
            return false;
        }
    }
}
