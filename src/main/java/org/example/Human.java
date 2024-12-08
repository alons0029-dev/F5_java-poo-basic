package org.example;

public class Human extends Character {
    private String longName;
    private String hairColour;
    private String eyeColour;
    private double weight;
    private double height;
    private int age;

    public Human(String shortName, String longName, String hairColour, String eyeColour, double weight, double height, int age) {
            super(shortName);
            this.longName = longName;
            this.hairColour = hairColour;
            this.eyeColour = eyeColour;
            this.weight = weight;
            this.height = height;
            this.age = age;
        }

        // LONG NAME
        public String getLongName() { return longName; }
        public void setLongName(String longName) { this.longName = longName; }

        // HAIR COLOUR
        public String getHairColour() { return hairColour; }
        public void setHairColour(String hairColour) { this.hairColour = hairColour; }

        // EYE COLOUR
        public String getEyeColour() { return eyeColour; }
        public void setEyeColour(String eyeColour) { this.eyeColour = eyeColour; }

        // WEIGHT
        public double getWeight() { return weight; }
        public void setWeight(double weight) { this.weight = weight; }

        // HEIGHT
        public double getHeight() { return height; }
        public void setHeight(double height) { this.height = height; }

        // AGE
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }

    public String introduce() {
        return "Hello, I'm " + this.longName + " (known as " + shortName + ") and I'm " + this.age + " years old.\n" + "I'm " + this.height + " m tall and weight " + this.weight + " Kg.\n" + "My hair is " + this.hairColour + " and my eyes are " + this.eyeColour + ".";
    }
}

