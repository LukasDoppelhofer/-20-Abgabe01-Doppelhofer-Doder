package at.fhj.iit;

import java.util.ArrayList;

/**
 * Class represents a cocktail that contains several liquids
 */

public class Cocktail extends Drink{

    /**
     * enum that represents the color of the cocktail
     */
    public enum Color {
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
     */
    public Cocktail(String name, Color cocktailColor,ArrayList<Liquid> liquidList) {
        super(name);
        this.cocktailColor = cocktailColor;
        this.liquidList = liquidList;
        this.volume = calculateVolume();
        this.alcoholPercent = calculateAlcoholPercent();
    }
    /**
     * this method sums up the volumes of all liquids on the liquidList
     *
     * @return volume of the cocktail
     * @throws IllegalArgumentException if the volume of a liquid is negative
     */
    private double calculateVolume() throws IllegalArgumentException{
        double volume = 0;
        for (Liquid l : liquidList) {
            if (l.getVolume() < 0) {
                throw new IllegalArgumentException("Liquid " + liquidList.indexOf(l) + " has a negative volume!!!");
            }
            volume += l.getVolume();
        }
        return volume;
    }

    /**
     * this method is called if the user drinks from the cocktail. it adjusts
     * the volume of the drink
     *
     * @throws IllegalArgumentException if sip is negative or if the sip is
     * bigger than the volume of the cocktail
     * @throws DisinfectantException if the user drinks disinfectant
     */
    public void drink(double sip) throws IllegalArgumentException, DisinfectantException{

        if(sip == 0) {
            return;
        }

        if (sip < 0){
            throw new IllegalArgumentException("You cannot drink a negative amount!!!");
        }

        if (sip <= volume) {

            if(alcoholPercent > 90) {
                throw new DisinfectantException("User died!!! :(");
            }

            for (Liquid l :liquidList) {
                double vol = l.getVolume();
                double diff = vol - (sip / liquidList.size());
                l.setVolume(diff);
            }
            this.volume = calculateVolume();
            this.alcoholPercent = calculateAlcoholPercent();

        } else {
            throw new IllegalArgumentException("You cannot drink more than what is in your cup!!! :-)");
        }
    }

    /**
     * this method calculates the alcohol content in per cent depending on
     * the alcoholic percentage of the liquid and the volume
     * that has been added of that liquid
     *
     *
     * @return alcoholPercent of the cocktail
     * @throws IllegalArgumentException if the alcoholPercent of a liquid is
     * out of the percentage bounds
     */
    private double calculateAlcoholPercent() throws IllegalArgumentException{

        if (volume <= 0) {
            return 0;
        }

        double alcoholVolume = 0;
        for(Liquid l: liquidList) {
            double liquidAlcohol = l.getAlcoholPercent();
            if(liquidAlcohol > 100 || liquidAlcohol < 0) {
                throw new IllegalArgumentException("Liquid " + liquidList.indexOf(l) +
                        " contains an invalid percentage of alcohol!!!");
            }
            alcoholVolume += l.getVolume() * liquidAlcohol / 100;
        }

        return alcoholVolume/volume * 100;
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
        this.volume = calculateVolume();
        this.alcoholPercent = calculateAlcoholPercent();
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
    public String listToString() {
        String text = "";
        for (Liquid l : liquidList) {
            text += l.getName() + l.getVolume() + l.getAlcoholPercent();
        }
        return text;
    }
}
