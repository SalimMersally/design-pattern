package com.salim.behavioral.templatemethod.example;

// The Abstract class
public abstract class Character {

    // Template Method
    public void play() {
        System.out.println("############ Starting a new Game ############");
        startGame();
        chooseAbility();
        useAbility();
        finishGame();
    }

    protected abstract void startGame();
    protected abstract void chooseAbility();
    protected abstract void useAbility();
    protected abstract void finishGame();

}
