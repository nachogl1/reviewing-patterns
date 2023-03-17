package com.nachogl1.reviewingpatterns.structural.proxy.kata;

public class StubbedSlowServer implements Resource {


    public static final String RESOURCE = "ola k ase!";

    @Override
    public String getResource() {
        String resource = "";
        try {
            Thread.sleep(10000);
            //compute super resource
            resource = RESOURCE;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return resource;
    }
}
