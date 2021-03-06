package com.hamish.decorator.coffee;

import com.hamish.decorator.coffee.beverages.Beverage;
import com.hamish.decorator.coffee.beverages.DarkRoast;
import com.hamish.decorator.coffee.beverages.Espresso;
import com.hamish.decorator.coffee.beverages.HouseBlend;
import com.hamish.decorator.coffee.condiments.Mocha;
import com.hamish.decorator.coffee.condiments.Soy;
import com.hamish.decorator.coffee.condiments.Whip;

/**
 * Created by hamishdickson on 06/12/14.
 *
 * The Decorator Pattern: attaches additional responsibilities to an object
 * dynamically. Decorators provide a flexible alternative to subclassing for
 * extending functionality.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        /**
         * idea: create a new beverage, decorate it with a mocha (twice - double)
         * and then decorate it with whip
          */
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1); // create a new decorator, which takes a beverage
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
