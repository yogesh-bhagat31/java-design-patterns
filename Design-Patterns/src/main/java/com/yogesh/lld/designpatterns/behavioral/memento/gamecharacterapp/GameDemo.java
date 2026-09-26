package com.yogesh.lld.designpatterns.behavioral.memento.gamecharacterapp;

public class GameDemo {

    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter("Naruto");
        CheckpointManager manager = new CheckpointManager();

        hero.showStatus();
        manager.saveCheckpoint(hero); // Checkpoint 1: Health=100, Mana=50, Level=1


        hero.takeDamage(30);
        hero.castSpell(20);
        hero.showStatus();
        manager.saveCheckpoint(hero); // Checkpoint 2: Health=70, Mana=30, Level=1

        hero.levelUp();
        hero.moveTo(10, 15);
        hero.showStatus(); // Health=100, Mana=50, Level=2, Pos=(10,15), Please observe here we are not saving checkpoint of character, from this only we have to undo operation

        manager.undo(hero); // let's go back to checkpoint 2
        hero.showStatus();

        manager.undo(hero); //let's go back to checkpoint 1
        hero.showStatus();

        manager.redo(hero); // let's go to checkpoint2
        hero.showStatus();

    }
}
