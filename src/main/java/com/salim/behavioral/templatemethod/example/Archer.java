package com.salim.behavioral.templatemethod.example;

public class Archer extends Character{
    @Override
    protected void startGame() {
        System.out.println("Archer starts the game.");
    }

    @Override
    protected void chooseAbility() {
        System.out.println("Archer chooses bow shot.");
    }

    @Override
    protected void useAbility() {
        System.out.println("Archer shoots an arrow to deal damage.");
    }

    @Override
    protected void finishGame() {
        System.out.println("Archer wins the game.");
    }
}
