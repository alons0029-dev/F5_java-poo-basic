package org.example;

public class LyokoCharacter {
    public String name;
    public String hairColour;
    public String eyeColour;
    public String weapons;
    public String powers;
    public double height;
    public int weight;
    public int age;

    public LyokoCharacter (String name, String hairColour, String eyeColour, String weapons,String powers, int weight, double height, int age) {
        this.name = name;
        this.hairColour = hairColour;
        this.eyeColour = eyeColour;
        this.weapons = weapons;
        this.powers = powers;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public String introduce() {
        return "CHARACTER: " + this.name + ".\n" +
                "Hello. My name is " + this.name + " and I'm " + this.age + " years old.\n" +
                "My hair colour is " + this.hairColour + " and my eyes are " + this.eyeColour + ".\n" +
                "I weight " + this.weight + " Kg and I'm " + this.height + " cm tall.\n" +
                "Weapons I use: " + this.weapons + ". Powers I have: " + this.powers + ".";
    }
}
