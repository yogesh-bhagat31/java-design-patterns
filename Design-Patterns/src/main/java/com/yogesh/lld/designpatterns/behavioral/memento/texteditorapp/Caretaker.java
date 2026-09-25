package com.yogesh.lld.designpatterns.behavioral.memento.texteditorapp;

import java.util.Stack;

public class Caretaker {

    //Here we are just using memento as state, but we can not modify or see anything as state is private
    private Stack<TextEditor.Memento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.save());
        System.out.println("*** State saved ***");
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            TextEditor.Memento memento = history.pop();
            editor.restore(memento);
            System.out.println("*** Undo performed ***");
        } else {
            System.out.println("*** Nothing to undo ***");
        }
    }

}
