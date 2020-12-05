package com.company.Class271;

public class Archer extends Warrior {
    private int count = 0;

    public int attack (Warrior warrior) {
        if (count == 4) {
            return getDamage() * 4;
        }
        count++;
        return getDamage();
    }

}
