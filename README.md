# Software Configuration Management

**Assignment: 01 Test Automation**

This Repository contains the Drink project we had to work with.

**Contributors**

* [Lukas Doppelhofer](https://github.com/LukasDoppelhofer)
* [Benjamin Doder](https://github.com/BenjaminDoder)

## Project Drinks

We had to work with the given project drinks. This project consists of classes Liquid, Drinks and SimpleDrinks which extends the class Drinks. We expanded the project and added a class Cocktail. In this class we created our own methods which we later used for testing. 

### Additions to original Drinks project:

**Class Cocktail:** 

Class Cocktail extends from class drink. A cocktail can be made with several liquids. A cocktail can have one of a variety of different colors. It can be red, blue, green, yellow or clear if it transparent. The volume of a cocktail is calculated by simply summing up the volumes of every liquid. The alcoholic content of a cocktail also depends on the liquids that are added into the drink.

We have decided to implement a method called **drink();**. This method is being called everytime the user takes a sip from the cocktail. If the users drinks from a cocktail which has over 90% alcohol content, the user dies and the DisinfectantException is thrown.

```java
//add drink();
```

