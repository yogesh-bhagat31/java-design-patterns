package com.yogesh.lld.designpatterns.behavioral.memento.texteditorapp;

public class TextEditor {

    private String content;
    private String fontStyle;
    private int fontSize;

    public TextEditor() {
        this.content = "";
        this.fontStyle = "Arial";
        this.fontSize = 12;
    }

    //Normal business methods
    public void write(String text) {
        this.content += text;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void showCurrentState() {
        System.out.println("Content: " + content + " | Font: " + fontStyle + " | Size: " + fontSize);
    }

    //Create memento static nested class as making this class as public to outer world make not sense. This is only related to Text editor hence we made static inner class
    public static class Memento {

        // We made the fields as final to make this class object as immutable.
        //Once it made no one will change the state of this memento.
        //This is very important as memento is frozen snapshot.
        private final String content;
        private final String fontStyle;
        private final int fontSize;

        // We made constructor private as only text editor allowed to use it
        private Memento(String content, String fontStyle, int fontSize) {
            this.content = content;
            this.fontStyle = fontStyle;
            this.fontSize = fontSize;
        }


        // All getters we made as private as only outer class will be able to access this class.
        private String getContent() {
            return content;
        }

        private String getFontStyle() {
            return fontStyle;
        }

        private int getFontSize() {
            return fontSize;
        }

    }


    //Let us pack text editor state to Memento. We captured editor state to Memento. Without violating encapsulation
    public Memento save(){
        return new Memento(this.content, this.fontStyle, this.fontSize);
    }

    // Undo state from Memento.
    public void restore(Memento memento){
        this.content = memento.getContent();  //private method call allowed since same outer class.
        this.fontStyle = memento.getFontStyle();
        this.fontSize = memento.getFontSize();
    }
}
