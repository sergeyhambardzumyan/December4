package com.company.Class271;

public class Swordsman extends Warrior{
    private int armor = 20;

    public int attack(Warrior warrior) {
        System.out.println("This is Swordsman area");
        return warrior.getDamage() - warrior.getDamage() * armor / 100;

    }
}
