package com.hamish.strategy.dungeons.characters;

import com.hamish.strategy.dungeons.behaviors.AxeBehavior;

import java.lang.*;

/**
 * Created by hamishdickson on 10/11/14.
 */
public class Troll extends Character {
    public Troll() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Grunt");
        weapon.useWeapon();
    }
}
