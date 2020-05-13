# Software Configuration Management

**Assignment: 01 Test Automation**

This Repository contains the Drink project we had to work with.

**Contributors**

* [Lukas Doppelhofer](https://github.com/LukasDoppelhofer)(FH Campus02)
* [Benjamin Doder](https://github.com/doderben)(FH Campus02)

## Project Drinks

We had to work with the given project drinks. This project consists of classes `Liquid`, `Drink` and `SimpleDrink` which extends the class Drink. We expanded the project and added a class `Cocktail`. In this class we created our own methods which we later used for testing. 

### Additions to Drinks project:

**Class Cocktail:** 

This class extends the class Drink. A cocktail can be made with several liquids. A cocktail can have one of a variety of different colors. It can be red, blue, green, yellow or clear if it is transparent. The volume of a cocktail is calculated by simply summing up the volumes of every liquid. The alcoholic content of a cocktail also depends on the liquids that are added into the drink.

We have decided to implement a method called `drink()`. This method is being called every time the user takes a sip from the cocktail. If the users drinks from a cocktail which has over 90% alcohol content, the user dies and the `DisinfectantException` is thrown.

**Class DisinfectantException:** 

In this class the DisinfectantException is thrown when the user drinks from a drink with over 90% alcoholic content.

* [Class Cocktail](https://github.com/LukasDoppelhofer/20-Abgabe01-Doppelhofer-Doder/blob/master/src/main/java/at/fhj/iit/Cocktail.java)
* [Class DisinfectantException](https://github.com/LukasDoppelhofer/20-Abgabe01-Doppelhofer-Doder/blob/master/src/main/java/at/fhj/iit/DisinfectantException.java)

Here is a code snippet of the method `drink()` which throws the self made `DisinfectantException`. 

```java
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
```

