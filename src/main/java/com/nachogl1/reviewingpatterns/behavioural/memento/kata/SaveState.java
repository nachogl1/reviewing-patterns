package com.nachogl1.reviewingpatterns.behavioural.memento.kata;

import static com.nachogl1.reviewingpatterns.behavioural.memento.kata.Account.*;

public interface SaveState {
    void restore(Memento memento);

    Memento takeSnapshot();

    String getLevelName();

    void setLevel(String levelName);
}
