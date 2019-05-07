package com.joshua.model;

public class Simulation {

    public static void main(String[] args) {
        FlyingVehicle fv = new FlyingVehicle((short)4, new Engine());
        fv.setName("US Destroyer");
        System.out.println(fv.getName());

        Airplane ap = new Airplane((short)4,(short)5);
        ap.move(15);
    }
}
