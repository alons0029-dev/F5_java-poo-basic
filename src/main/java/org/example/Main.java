package org.example;
import org.example.LyokoCharacter;

public class Main {
    public static void main(String[] args) {
        LyokoCharacter Jeremie = new LyokoCharacter(
                "Jeremie Belpois",
                "Blond",
                "Blue",
                "Unknown",
                "Unknown",
                31,
                1.47,
                13
        );
        LyokoCharacter Aelita = new LyokoCharacter(
                "Aelita Schaeffer",
                "Bright pink",
                "Dark green",
                "Energy Fields",
                "Second Sight, Petrification",
                35,
                1.45,
                13
        );
        LyokoCharacter OddDR = new LyokoCharacter(
                "Odd Della Robbia",
                "Blond (with purple dye)",
                "Brown",
                "Laser Arrows",
                "Shield",
                32,
                1.43,
                13
        );
        LyokoCharacter Urlich = new LyokoCharacter(
                "Ulrich Stern",
                "Brown",
                "Brown",
                "Katana",
                "Triplicate, Super Sprint",
                45,
                1.56,
                13
        );
        LyokoCharacter Yumi = new LyokoCharacter(
                "Yumi Ishiyama",
                "Black",
                "Brown",
                "Tessen Fans",
                "Telekinesis",
                50,
                1.65,
                14
        );
        LyokoCharacter William = new LyokoCharacter(
                "William Dunbar",
                "Black",
                "Navy Grey",
                "Zwelhändler",
                "Super Smoke, Energy Slash",
                57,
                1.70,
                14
        );

        // JEREMIE
        System.out.println(Jeremie.introduce());
        System.out.println();

        // AELITA
        System.out.println(Aelita.introduce());
        System.out.println();

        // ODD
        System.out.println(OddDR.introduce());
        System.out.println();

        // ULRICH
        System.out.println(Urlich.introduce());
        System.out.println();

        // YUMI
        System.out.println(Yumi.introduce());
        System.out.println();

        // WILLIAM
        System.out.println(William.introduce());
        System.out.println();
    }
}