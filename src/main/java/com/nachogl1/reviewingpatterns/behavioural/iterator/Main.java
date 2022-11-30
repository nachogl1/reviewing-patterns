package com.nachogl1.reviewingpatterns.behavioural.iterator;

public class Main {
    public static void main(String[] args) {
        SpecialCollection collection = new SpecialCollection();
        Iterator it = collection.getIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
