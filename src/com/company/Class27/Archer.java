package com.company.Class27;

public class Archer extends Warrior {


    public int attack(Swordsman swordsman) {
        int damage = swordsman.getDamage();if (getLife() > 0) {
            System.out.println("Now Archer has " + getLife() + " life to continue the battle.");
            System.out.println("Swordsman attacked Archer and took " + damage + " life.");

        }
        return  damage;
    }

    public int attack(Magician magician) {

        int damage = magician.getDamage();
        if (getLife() > 0) {
            System.out.println("Now Archer has " + getLife() + " life to continue the battle.");
            System.out.println("Magician attacked Archer and took " + damage + " life.");

        }
        return damage;
    }

}
