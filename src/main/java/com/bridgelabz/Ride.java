package com.bridgelabz;

/**
 * creating Ride class for getter and setter
 */
public class Ride {
    //constant variables
    private final int time;
    private double distance ;

    //Creating Constructor
    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
