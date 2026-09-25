package com.yogesh.lld.designpatterns.behavioral.memento.texteditorapp;

public class MementoPatternMain {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        //snapshot one saved
        editor.write("Hello");
        editor.setFontSize(12);
        caretaker.save(editor);
        editor.showCurrentState();

        //snapshot two saved
        editor.write(" , World!");
        editor.setFontSize(16);
        caretaker.save(editor);
        editor.showCurrentState();

        System.out.println("****************");
        //Oops! I added exntra content
        editor.write(" Extra text.");
        editor.showCurrentState();

        //Lets do undo
        caretaker.undo(editor);
        editor.showCurrentState();

        //Let's do undo one more time
        caretaker.undo(editor);
        editor.showCurrentState();

    }
}
