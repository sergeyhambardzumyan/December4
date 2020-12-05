package com.company.Class27;

import javax.sound.midi.Soundbank;

public class Magician extends Warrior {


    public int attack(Swordsman swordsman) {
        int damage = swordsman.getDamage();
        if (getLife() > 0) {
            System.out.println("Now Magician has " + getLife() + " life to continue the battle.");
            System.out.println("Swordsman attacked Magician and took " + damage + " life.");
        }


        return  damage;
    }

    public int attack(Archer archer) {
        int damage = archer.getDamage();
        if (getLife() > 0) {
            System.out.println("Now Magician has " + getLife() + " life to continue the battle.");
            System.out.println("Archer attacked Magician and took " + damage + " life.");

        } else {
            System.out.println("Magician died as a hero in the battle with Archer.");
        }
        return damage;
    }


}
