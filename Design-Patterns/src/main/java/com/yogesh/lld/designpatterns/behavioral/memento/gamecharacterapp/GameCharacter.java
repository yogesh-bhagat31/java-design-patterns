package com.yogesh.lld.designpatterns.behavioral.memento.gamecharacterapp;

public class GameCharacter {
    private String name;
    private int health;
    private int mana;
    private int level;
    private int x, y; // position coordinates

    public GameCharacter(String name) {
        this.name = name;
        this.health = 100;
        this.mana = 50;
        this.level = 1;
        this.x = 0;
        this.y = 0;
    }

    // Business methods that change the states

    public void takeDamage(int damage) {
        this.health = Math.max(0, this.health - damage);
    }

    public void heal(int amount) {
        this.health = Math.min(100, this.health + amount);
    }

    public void castSpell(int manaCost) {
        if (manaCost > this.mana) {
            System.out.println("Not enough mana!");
            return;
        }
        this.mana -= manaCost;
    }

    public void levelUp() {
        this.level++;
        this.health = 100;
        this.mana = 50;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showStatus() {
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Mana: " + this.mana);
        System.out.println("Level: " + this.level);
        System.out.println("X: " + this.x);
        System.out.println("Y: " + this.y);

    }

    public static class Checkpoint {
        private final int health;
        private final int mana;
        private final int level;
        private final int x, y;
        private final long timeStamp;

        private Checkpoint(int health, int mana, int level, int x, int y) {
            this.health = health;
            this.mana = mana;
            this.level = level;
            this.x = x;
            this.y = y;
            this.timeStamp = System.currentTimeMillis();
        }

        private int getHealth() {
            return health;
        }

        private int getMana() {
            return mana;
        }

        private int getLevel() {
            return level;
        }

        private int getX() {
            return x;
        }

        private int getY() {
            return y;
        }

        /**
         * Returns the timestamp at which this checkpoint was created.
         * <p>
         * Unlike the core game state fields ({@code health}, {@code mana},
         * {@code level}, {@code x}, {@code y}), which are kept strictly private
         * to preserve encapsulation, this getter is intentionally public.
         * The timestamp is non-sensitive metadata — exposing it does not
         * reveal or compromise the character's internal state, and is useful
         * for debugging and logging purposes.
         * <p>
         * This demonstrates that the Memento pattern does not require
         * <b>all</b> fields to be hidden; selective exposure of harmless
         * metadata is a valid design choice within the pattern.
         *
         * @return the time (in milliseconds since epoch) when this checkpoint was saved
         */
        public long getTimeStamp() {
            return timeStamp;
        }
    }

    public Checkpoint save(){
        return  new Checkpoint(health,mana,level,x,y);
    }


    public void restore(Checkpoint checkpoint){
        this.health = checkpoint.getHealth();
        this.mana = checkpoint.getMana();
        this.level = checkpoint.getLevel();
        this.x = checkpoint.getX();
        this.y = checkpoint.getY();
    }
}
