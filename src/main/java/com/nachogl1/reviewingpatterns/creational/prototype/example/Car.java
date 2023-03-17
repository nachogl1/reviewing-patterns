package com.nachogl1.reviewingpatterns.creational.prototype.example;

public class Car implements Prototype{
    private String name;
    private int maxSpeed;
    private GPSDevice gpsDevice;

    public Car() {
    }

    private Car(Car source) {
        this.name = source.name;
        this.maxSpeed = source.maxSpeed;
        this.gpsDevice = this.gpsDevice.clone();
    }

    public Car clone() {
        return new Car(this);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public GPSDevice getGpsDevice() {
        return gpsDevice;
    }

    public void setGpsDevice(GPSDevice gpsDevice) {
        this.gpsDevice = gpsDevice;
    }
}
