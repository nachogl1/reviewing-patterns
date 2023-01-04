package com.nachogl1.reviewingpatterns.structural.flyweight;

public class BookNoFlyweight {

    private final String name;
    private final int price;
    private final String type;
    private final String distributor;
    private final String otherData;

    public BookNoFlyweight(String name, int price, String type, String distributor, String otherData) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookNoFlyweight{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", type='").append(type).append('\'');
        sb.append(", distributor='").append(distributor).append('\'');
        sb.append(", otherData='").append(otherData).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
