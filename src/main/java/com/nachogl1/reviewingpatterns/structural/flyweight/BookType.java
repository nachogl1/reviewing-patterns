package com.nachogl1.reviewingpatterns.structural.flyweight;

public final class BookType {
    private final String type;
    private final String distributor;
    private final String otherData;

    public BookType(String type, String distributor, String otherData) {
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookType{");
        sb.append("type='").append(type).append('\'');
        sb.append(", distributor='").append(distributor).append('\'');
        sb.append(", otherData='").append(otherData).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
