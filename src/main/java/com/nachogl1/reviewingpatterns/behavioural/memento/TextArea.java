package com.nachogl1.reviewingpatterns.behavioural.memento;

public class TextArea implements Editable {

    private String value;

    public boolean isFirstChange() {
        return this.value == null ? true : false;
    }

    public Memento takeSnapshot() {
        return new Memento(this.value);
    }

    public void restore(Memento memento) {
        this.value = memento.getSavedText();
    }

    public void setValue(String text) {
        this.value = text;
    }

    public String getValue() {
        return value;
    }

    static class Memento {

        private final String text;

        private Memento(String text) {
            this.text = text;
        }

        private String getSavedText() {
            return text;
        }

    }
}
