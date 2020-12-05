package com.company.Class271;

import java.util.Random;

public class Magician extends Warrior {
    Random random = new Random();
    private int avoid = random.nextInt(20) + 30;

    public int attack(Warrior warrior) {
        return warrior.getDamage() - getDamage() * avoid / 100;
    }
}
