package com.salim.behavioral.templatemethod.example;

public class Mage extends Character{
    @Override
    protected void startGame() {
        System.out.println("Mage starts the game.");
    }

    @Override
    protected void chooseAbility() {
        System.out.println("Mage chooses fireball spell.");
    }

    @Override
    protected void useAbility() {
        System.out.println("Mage casts fireball spell to deal damage.");
    }

    @Override
    protected void finishGame() {
        System.out.println("Mage wins the game.");
    }
}
