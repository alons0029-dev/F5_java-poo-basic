package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* SETTING CHARACTERS */

        // JEREMIE BELPOIS
        Character Jeremie = new Character("Jeremie");

        Human JeremieHuman = new Human(
                Jeremie.shortName,
                "Jeremie Belpois",
                "blond",
                "blue",
                31,
                1.47,
                13
        );

        // AELITA SCHAEFFER
        Character Aelita = new Character("Aelita");

        Human AelitaHuman = new Human(
                Aelita.shortName,
                "Aelita Schaeffer",
                "bright pink",
                "dark green",
                35,
                1.45,
                13
        );

        LyokoWarrior AelitaWarrior = new LyokoWarrior(
                Aelita.shortName,
                "Energy Fields",
                "Second Sight"
        );

        // ODD DELLA ROBBIA
        Character OddDR = new Character("Odd");

        Human OddDRHuman = new Human(
                OddDR.shortName,
                "Odd Della Robbia",
                "blond (dyed purple)",
                "brown",
                32,
                1.43,
                13
        );

        LyokoWarrior OddDRWarrior = new LyokoWarrior(
                OddDR.shortName,
                "Laser Arrows",
                "Shield"
        );

        // ULRICH STERN
        Character Ulrich = new Character("Ulrich");

        Human UlrichHuman = new Human(
                Ulrich.shortName,
                "Ulrich Stern",
                "brown",
                "brown",
                45,
                1.56,
                13
        );

        LyokoWarrior UlrichWarrior = new LyokoWarrior(
                Ulrich.shortName,
                "Katana",
                "Super Sprint"
        );

        // YUMI ISHIYAMA
        Character Yumi = new Character("Yumi");

        Human YumiHuman = new Human(
                Yumi.shortName,
                "Yumi Ishiyama",
                "black",
                "brown",
                50,
                1.65,
                14
        );

        LyokoWarrior YumiWarrior = new LyokoWarrior(
                Yumi.shortName,
                "Tessen Fans",
                "Telekinesis"
        );

        // WILLIAM DUNBAR
        Character William = new Character("William");

        Human WilliamHuman = new Human(
                William.shortName,
                "William Dunbar",
                "black",
                "navy grey",
                57,
                1.70,
                14
        );

        LyokoWarrior WilliamWarrior = new LyokoWarrior(
                William.shortName,
                "Zwelhändler",
                "Super Smoke"
        );

        /* CHARACTER SELECT */
        Scanner characterSelect = new Scanner(System.in);

        // Available Characters
        System.out.println("Select your character:");
        System.out.println("1 - " + JeremieHuman.getLongName());
        System.out.println("2 - " + AelitaHuman.getLongName());
        System.out.println("3 - " + OddDRHuman.getLongName());
        System.out.println("4 - " + UlrichHuman.getLongName());
        System.out.println("5 - " + YumiHuman.getLongName());
        System.out.println("6 - " + WilliamHuman.getLongName());
        System.out.println();

        // Using Scanner
        System.out.print("Enter character number here: ");
        int selectedCharacter = characterSelect.nextInt();

        /* LOGIC */
        switch (selectedCharacter) {
            case 1:
                System.out.println(JeremieHuman.introduce());
                System.out.println();
                System.out.println("I can't transform into Lyoko Warrior...");
                break;
            case 2:
                System.out.println(AelitaHuman.introduce());
                System.out.println();
                System.out.println("I transform into Lyoko Warrior!");
                System.out.println();
                System.out.println("I use my weapon: " + AelitaWarrior.getWeapon());
                System.out.println("I use my power: " + AelitaWarrior.getPower());
                break;
            case 3:
                System.out.println(OddDRHuman.introduce());
                System.out.println();
                System.out.println("I transform into Lyoko Warrior!");
                System.out.println();
                System.out.println("I use my weapon: " + OddDRWarrior.getWeapon());
                System.out.println("I use my power: " + OddDRWarrior.getPower());
                break;
            case 4:
                System.out.println(UlrichHuman.introduce());
                System.out.println();
                System.out.println("I transform into Lyoko Warrior!");
                System.out.println();
                System.out.println("I use my weapon: " + UlrichWarrior.getWeapon());
                System.out.println("I use my power: " + UlrichWarrior.getPower());
                break;
            case 5:
                System.out.println(YumiHuman.introduce());
                System.out.println();
                System.out.println("I transform into Lyoko Warrior!");
                System.out.println();
                System.out.println("I use my weapon: " + YumiWarrior.getWeapon());
                System.out.println("I use my power: " + YumiWarrior.getPower());
                break;
            case 6:
                System.out.println(WilliamHuman.introduce());
                System.out.println();
                System.out.println("I transform into Lyoko Warrior!");
                System.out.println();
                System.out.println("I use my weapon: " + WilliamWarrior.getWeapon());
                System.out.println("I use my power: " + WilliamWarrior.getPower());
                break;
            default:
                System.out.println("Something went wrong, please try again.");
        }
    }
}