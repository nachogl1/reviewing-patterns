package com.nachogl1.reviewingpatterns.behavioural.memento;

import com.nachogl1.reviewingpatterns.behavioural.memento.TextArea.Memento;

import java.util.Stack;

public class Editor {

    private Stack<Memento> stateHistory = new Stack<>();
    private TextArea textArea = new TextArea();

    public void write(String text) {
        if (!textArea.isFirstChange())
            stateHistory.add(textArea.takeSnapshot());

        this.textArea.setValue(text);
    }

    public void undo() {
        textArea.restore(stateHistory.pop());
    }

    public String getText() {
        return textArea.getValue();
    }
}
