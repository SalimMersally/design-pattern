package com.salim.behavioral.templatemethod.example;

public class Warrior extends Character{
    @Override
    protected void startGame() {
        System.out.println("Warrior starts the game.");
    }

    @Override
    protected void chooseAbility() {
        System.out.println("Warrior chooses sword attack.");
    }

    @Override
    protected void useAbility() {
        System.out.println("Warrior uses sword attack to deal damage.");
    }

    @Override
    protected void finishGame() {
        System.out.println("Warrior wins the game.");
    }
}
