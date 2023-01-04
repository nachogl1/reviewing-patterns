package com.nachogl1.reviewingpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BookTypeFactory {
    private static final Map<String, BookType> types = new HashMap<>();

    public static BookType getBookType(String type, String distributor, String otherInfo) {
        BookType bookType = types.get(type);

        if (bookType == null) {
            bookType = new BookType(type, distributor, otherInfo);
            types.put(type, bookType);
        }
        return bookType;
    }
}
