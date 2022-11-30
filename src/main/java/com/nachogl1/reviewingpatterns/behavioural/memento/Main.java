package com.nachogl1.reviewingpatterns.behavioural.memento;

public class Main {

    public static void main(String[] arg) {

        Editor editor = new Editor();

        editor.write("First message");

        editor.write("second message");

        editor.write("third message");

        System.out.println(editor.getText());
        editor.undo();
        System.out.println(editor.getText());
        editor.undo();
        System.out.println(editor.getText());
    }
}
