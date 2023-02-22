package com.nachogl1.reviewingpatterns.behavioural.memento.kata;


public class Account implements SaveState {
    private String level = "Ground Level";

    public Memento takeSnapshot() {
        return new Memento(this.level);
    }

    public void restore(Memento memento) {
        this.level = memento.getSavedLevelName();
    }

    public void setLevel(String levelName) {
        this.level = levelName;
    }

    public String getLevelName() {
        return level;
    }

    static class Memento {

        private final String levelName;

        private Memento(String levelName) {
            this.levelName = levelName;
        }

        private String getSavedLevelName() {
            return levelName;
        }

    }
}
