package com.nachogl1.reviewingpatterns.behavioural.memento.example;

import com.nachogl1.reviewingpatterns.behavioural.memento.example.TextArea.Memento;

public interface Editable {
    boolean isFirstChange();

    void restore(Memento memento);

    Memento takeSnapshot();

    String getValue();

    void setValue(String value);
}
