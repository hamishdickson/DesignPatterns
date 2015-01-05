package com.hamish.compoundPatterns.example;

/**
 * Created by hamishdickson on 05/01/15.
 *
 * A goose isn't a duck, but we'd like to do a duck thing ...
 * so add an adapter to the stategy pattern we're already using :)
 *
 * remember an adapter implements the target interface, which in this
 * case is Quackable
 */
public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    /**
     * when quack is called, the call is delegated to the gooses honk()
     * method
     */
    @Override
    public void quack() {
        goose.honk();
    }
}
