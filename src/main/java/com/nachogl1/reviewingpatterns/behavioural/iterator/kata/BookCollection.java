package com.nachogl1.reviewingpatterns.behavioural.iterator.kata;

public class BookCollection implements Container {

    private int size = 0;
    private final Book[] books;

    public BookCollection(int capacity) {
        this.books = new Book[capacity];
    }

    @Override
    public BookIterator getIterator() {
        return new BookIterator();
    }

    public void add(Book book) {
        this.books[size++] = book;
    }

    public int getSize() {
        return size;
    }

    class BookIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Book next() {
            if (this.hasNext()) {
                return books[index++];
            }
            return null;
        }


    }
}
