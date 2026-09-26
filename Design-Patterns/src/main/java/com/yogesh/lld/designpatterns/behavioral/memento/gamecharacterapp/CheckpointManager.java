package com.yogesh.lld.designpatterns.behavioral.memento.gamecharacterapp;

import java.util.Stack;

/**
 * Manages undo and redo actions for a {@link GameCharacter} using
 * the Memento design pattern.
 * <p>
 * The core idea is simple: we keep two stacks — one for undo and
 * one for redo. Every time the player undoes or redoes an action,
 * we first save the character's current state into the *other*
 * stack, so that state is never lost and the player can always
 * move back and forth freely.
 * <p>
 * Think of it like two buckets passing water back and forth:
 * whichever direction you move (undo or redo), you first pour your
 * current state into the opposite bucket before taking the next one out.
 * <ul>
 *   <li>{@code saveCheckpoint()} — Saves a new checkpoint and clears
 *       the redo history, since any new action makes old "future"
 *       states invalid.</li>
 *   <li>{@code undo()} — Saves the current state for redo, then goes
 *       back to the last saved checkpoint.</li>
 *   <li>{@code redo()} — Saves the current state for undo, then moves
 *       forward to the next available checkpoint.</li>
 * </ul>
 */
public class CheckpointManager {

    /** Stores past checkpoints, used to undo to an earlier state. */
    private Stack<GameCharacter.Checkpoint> undoStack = new Stack<>();

    /** Stores undone checkpoints, used to redo forward again. */
    private Stack<GameCharacter.Checkpoint> redoStack = new Stack<>();


    /**
     * Saves the character's current state as a new checkpoint.
     * <p>
     * This checkpoint goes into the undo stack. The redo stack is
     * cleared at the same time — because once you do something new,
     * the old "redo" states are no longer valid. You can't redo into
     * a future that doesn't exist anymore.
     *
     * @param character the character whose state should be saved
     */
    public void saveCheckpoint(GameCharacter character) {
        undoStack.push(character.save());
        redoStack.clear();//after getting new checkpoint redo history become invalid
        System.out.println("***** checkpoint saved *****");
        System.out.println("=====================================");
    }


    /**
     * Reverts the character to its previous saved state.
     * <p>
     * Before going back, the current state is saved into the redo
     * stack so the player can move forward again later. Then the
     * most recent checkpoint is popped from the undo stack and restored.
     * <p>
     * If there is nothing to undo, this method does nothing.
     *
     * @param character the character to revert
     */
    public void undo(GameCharacter character) {
        if(undoStack.isEmpty()) {
            System.out.println("***** nothing to undo *****");
            return;
        }
        redoStack.push(character.save());// Before doing undo save this current state for redo operation
        GameCharacter.Checkpoint checkpoint = undoStack.pop();
        character.restore(checkpoint);
        System.out.println("***** undo performed *****");
    }


    /**
     * Moves the character forward to the state it was in before
     * the last undo.
     * <p>
     * Before moving forward, the current state is saved into the
     * undo stack so the player can undo again later if needed. Then
     * the most recent checkpoint is popped from the redo stack and restored.
     * <p>
     * If there is nothing to redo, this method does nothing.
     *
     * @param character the character to move forward
     */
    public void redo(GameCharacter character) {
        if(redoStack.isEmpty()) {
            System.out.println("***** nothing to redo *****");
            return;
        }
        undoStack.push(character.save());// Before doing redo again we will save this state back to undo stack for undo operation
        GameCharacter.Checkpoint checkpoint = redoStack.pop();
        character.restore(checkpoint);
        System.out.println("***** redo performed *****");
    }
}
