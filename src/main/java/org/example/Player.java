package org.example;

public abstract class Player {
    private int health;
    private int strength;
    private int lives;

    private int originalHealth;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.originalHealth = health;
        this.strength = strength;
        this.lives = lives;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getLives() {
        return lives;
    }
    public void setLives(int lives) {
        this.lives = lives;
    }
    public int getOriginalHealth() {
        return originalHealth;
    }


    public void decrementLive() {
        if (lives > 0) {
            lives--;
            setHealth(getOriginalHealth());
        }else{
            System.out.println("This character is dead!");
        }
    }

    public void attack(Player player) {
        player.setHealth(player.getHealth() - this.strength);
    }

    public void checkHealth() {
        if (health <= 0) {
          decrementLive();
        }
    }
}
