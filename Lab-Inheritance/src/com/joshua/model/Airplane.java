package com.joshua.model;

public class Airplane extends FlyingVehicle {
    private short wheels;
    private short propellers;


    //constructor
    public Airplane(short wheels, short propellers){
        this.wheels = wheels;
        this.propellers = propellers;
}
    //getters and setters

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public void setPropellers(short propellers) {
        this.propellers = propellers;
    }

    public short getWheels() {
        return wheels;
    }

    public short getPropellers() {
        return propellers;
    }
        public void turnOn(){
            System.out.println("Turning");
        }
    }

