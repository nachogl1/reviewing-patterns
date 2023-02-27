package com.nachogl1.reviewingpatterns.behavioural.iterator.example;

public class SpecialCollection implements Container {

    String values[] = new String[]{"ONE", "TWO", "THREE"};

    @Override
    public Iterator getIterator() {
        return new SpecialIterator();
    }


    class SpecialIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            if (index < values.length) {
                return true;
            }
            return false;
        }

        @Override
        public String next() {

            if (this.hasNext()) {
                return values[index++];
            }
            return null;
        }


    }
}