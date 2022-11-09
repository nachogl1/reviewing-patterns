package com.nachogl1.reviewingpatterns.creational.prototype;

public class GPSDevice implements Prototype {
    private String model;

    public GPSDevice() {
    }

    private GPSDevice(GPSDevice source) {
        this.model = source.model;
    }

    @Override
    public GPSDevice clone() {
        return new GPSDevice(this);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
