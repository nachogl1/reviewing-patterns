package com.nachogl1.reviewingpatterns.structural.flyweight;

public class FlyweightBook {
    private final String name;
    private final int price;
    private final BookType type;

    public FlyweightBook(String name, int price, BookType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
