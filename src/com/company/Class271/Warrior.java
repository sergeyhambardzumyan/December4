package com.company.Class271;

public class Warrior {
    //    region Private Members
    private String name;
    private int life;
    private int damage;
//    endregion

    //    region Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
// endregion

    public int attack(Warrior warrior) {

        return warrior.damage;

    }
}
