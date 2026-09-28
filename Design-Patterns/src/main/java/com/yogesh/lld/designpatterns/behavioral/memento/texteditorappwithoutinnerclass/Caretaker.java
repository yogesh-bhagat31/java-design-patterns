package com.yogesh.lld.designpatterns.behavioral.memento.texteditorappwithoutinnerclass;

import java.util.Stack;

/*
The Memento pattern gives us the structure to preserve encapsulation,
 but developers still have to follow the intended responsibilities.
 */
public class Caretaker {

    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.empty()) {
            history.pop();
            editor.restore(history.peek());
        }
    }
}
