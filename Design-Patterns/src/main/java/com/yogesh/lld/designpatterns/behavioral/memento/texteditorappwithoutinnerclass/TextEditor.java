package com.yogesh.lld.designpatterns.behavioral.memento.texteditorappwithoutinnerclass;

public class TextEditor {
    private String content;

    public void write(String text){
        this.content = text;
    }

    // Save the current state of editor

}
