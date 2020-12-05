package com.company.Class271;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Magician magician = new Magician();
        magician.setLife(2000);
        magician.setDamage(random.nextInt(300) + 100);
        magician.setName("Magician");
        Swordsman swordsman = new Swordsman();
        swordsman.setLife(1500);
        swordsman.setDamage(random.nextInt(300) + 200);
        swordsman.setName("Swordsman");
        Archer archer = new Archer();
        archer.setLife(1000);
        archer.setDamage(random.nextInt(300) + 200);
        archer.setName("Archer");

        Warrior warrior = new Warrior();

        int selection;
        do {
            System.out.println("Please Make your selection");
            System.out.println("Enter 1 to watch Magician and Swordsman battle");
            System.out.println("Enter 2 to watch Magician and Archer battle");
            System.out.println("Enter 3 to watch Swordsman and Archer battle");

            selection = scanner.nextInt();
        } while (selection != 1 && selection != 2 && selection != 3);

        switch (selection) {
            case 1:
                while (true) {
                    System.out.println();
                    int luck = random.nextInt(2);
                    if (luck == 1) {
                        swordsman.setLife(swordsman.getLife() - warrior.attack(magician));
                        printResult(magician,swordsman);
                        if (swordsman.getLife() <= 0) {
                            System.out.println();
                            System.out.println("Magician won!!!");
                            break;
                        }
                    } else {
                        magician.setLife(magician.getLife() - warrior.attack(swordsman));
                        printResult(swordsman,magician);
                        if (magician.getLife() <= 0) {
                            System.out.println();
                            System.out.println("Swordsman won!!!");
                            break;
                        }
                    }


                }
                break;
            case 2:
                while (true) {
                    System.out.println();
                    int luck = random.nextInt(2);
                    if (luck == 1) {
                        archer.setLife(archer.getLife() - magician.getDamage());
                        printResult(magician,archer);
                        if (archer.getLife() <= 0) {
                            System.out.println();
                            System.out.println("Magician won!!!");
                            break;
                        }
                    } else {
                        magician.setLife(magician.getLife() - archer.getDamage());
                        printResult(archer,magician);
                        if (magician.getLife() <= 0) {
                            System.out.println();
                            System.out.println("Archer won!!!");
                            break;
                        }
                    }

                }
                break;
            case 3:
                while (true) {
                    System.out.println();
                    int luck = random.nextInt(2);
                    if (luck == 1) {
                        swordsman.setLife(swordsman.getLife() - archer.getDamage());
                        printResult(archer,swordsman);
                        if (swordsman.getLife() <= 0) {
                            System.out.println();
                            System.out.println("Archer won!!!");
                            break;
                        }
                    } else {
                        archer.setLife(archer.getLife() - swordsman.getDamage());
                        printResult(swordsman,archer);
                        if (archer.getLife() <= 0) {
                            System.out.println();
                            System.out.println("Swordsman won!!!");
                            break;
                        }
                    }

                }
                break;
        }
    }

    public static void printResult(Warrior warrior1, Warrior warrior2) {
        if(warrior1.getLife() < 0){
            warrior1.setLife(0);
        } else if (warrior2.getLife() < 0) {
            warrior2.setLife(0);
        }
        System.out.println(warrior1.getName() + " attacked " + warrior2.getName());
        System.out.println(warrior1.getName() + " has life: " + warrior1.getLife());
        System.out.println(warrior2.getName() + " has life: " + warrior2.getLife());
    }

}
