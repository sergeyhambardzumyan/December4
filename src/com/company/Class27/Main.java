package com.company.Class27;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Magician magician = new Magician();
        magician.setLife(2000);
        magician.setDamage(200);
        Swordsman swordsman = new Swordsman();
        swordsman.setLife(1500);
        swordsman.setDamage(150);
        Archer archer = new Archer();
        archer.setLife(1000);
        archer.setDamage(100);

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
                        if (luck == 0) {
                           swordsman.setLife(swordsman.getLife() - swordsman.attack(magician));

                        } else {
                           magician.setLife(magician.getLife() - magician.attack(swordsman));
                        }
                        if(magician.getLife() <= 0 ) {
                            System.out.println();
                            System.out.println("Magician died as a hero in the battle with Swordsman.");
                            break;
                        } else if (swordsman.getLife() <= 0) {
                            System.out.println();
                            System.out.println("Swordsman died as a hero in the battle with Magician.");
                            break;
                        }


                    }
                break;
            case 2:
                while (true) {
                    System.out.println();
                    int luck = random.nextInt(2);
                    if (luck == 1) {
                        archer.setLife(archer.getLife() - archer.attack(magician));

                    } else {
                        magician.setLife(magician.getLife() - magician.attack(archer));
                    }
                    if(magician.getLife() <= 0 ) {
                        System.out.println();
                        System.out.println("Magician died as a hero in the battle with Swordsman.");
                        break;
                    } else if (archer.getLife() <= 0) {
                        System.out.println();
                        System.out.println("Archer died as a hero in the battle with Magician.");
                        break;
                    }


                }

                break;
            case 3:
                while (true) {
                    System.out.println();
                    int luck = random.nextInt(2);
                    if (luck == 1) {
                        archer.setLife(archer.getLife() - archer.attack(swordsman));

                    } else {
                        swordsman.setLife(swordsman.getLife() - swordsman.attack(archer));
                    }
                    if(swordsman.getLife() <= 0 ) {
                        System.out.println();
                        System.out.println("Swordsman died as a hero in the battle with Swordsman.");
                        break;
                    } else if (archer.getLife() <= 0) {
                        System.out.println();
                        System.out.println("Archer died as a hero in the battle with Magician.");
                        break;
                    }


                }

                break;
            default:
                System.out.println("No way you get to this point!");
        }


    }
}
