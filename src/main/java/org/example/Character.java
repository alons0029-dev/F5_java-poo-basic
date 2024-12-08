package org.example;

public class Character {
    String shortName;

    public Character (String shortName) {
        this.shortName = shortName;
    }

    // NAME
    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
