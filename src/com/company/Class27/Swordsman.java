package com.company.Class27;

public class Swordsman extends Warrior {
    private int armor = 20;

    public int attack(Magician magician) {
        int damage = magician.getDamage();
        if (getLife() > 0) {
            System.out.println("Now Swordsman has " + getLife() + " life to continue the battle.");
            System.out.println("Magician attacked Swordsman and took " + damage + " life.");
        }
        return  damage - damage * armor / 100;
    }

    public int attack(Archer archer) {
        int damage = archer.getDamage();
        if (getLife() > 0) {
            System.out.println("Now Swordsman has " + getLife() + " life to continue the battle.");
            System.out.println("Archer attacked Swordsman and took " + damage + " life.");
        } else {
            System.out.println("Swordsman died as a hero in the battle with Archer.");
        }
        return damage - damage * armor / 100;
    }


}
