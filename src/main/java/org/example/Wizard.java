package org.example;

public class Wizard extends Player {
    private String spell;

    SpellLibrary spellLibrary;

    public Wizard(int health, int strength, int lives, String spell) {
        super(health, strength, lives);
        this.spell = spell;
    }

    public Elf convertToElf() {
        return new Elf(getHealth(), getStrength(), getLives(), 1);
    }

    public String castSpell() {
        return "Casting" + spellLibrary.getRandomSpell();
    }
}
