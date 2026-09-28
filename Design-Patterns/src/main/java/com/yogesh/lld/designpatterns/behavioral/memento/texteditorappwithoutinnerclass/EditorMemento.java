package com.yogesh.lld.designpatterns.behavioral.memento.texteditorappwithoutinnerclass;

public class EditorMemento {

    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
