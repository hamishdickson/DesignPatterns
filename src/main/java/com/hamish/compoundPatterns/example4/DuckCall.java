package com.hamish.compoundPatterns.example4;

/**
 * Created by hamishdickson on 05/01/15.
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}