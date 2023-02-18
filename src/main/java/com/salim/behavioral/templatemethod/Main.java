package com.salim.behavioral.templatemethod;

import com.salim.behavioral.templatemethod.example.Archer;
import com.salim.behavioral.templatemethod.example.Mage;
import com.salim.behavioral.templatemethod.example.Warrior;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        Archer archer = new Archer();

        warrior.play();
        mage.play();
        archer.play();
    }
}
