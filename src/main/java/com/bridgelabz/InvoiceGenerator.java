package com.bridgelabz;
/**
 * @author mandeep
 * creating class InvoiceGenerator
 */
public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KILOMETER =10 ;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE =5 ;
    //Main method
    public static void main(String[] args) {
        System.out.println("Welcome to cab invoice generator");
    }
    //Creating calculateFare method
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        if (totalFare < MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalFare;
    }
    //Creating calculateTotalFare method
    public double calculateTotalFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.getDistance(), ride.getTime());
        }
        return totalFare;
    }
    //Creating getNumberOfRides method
    public int getNumberOfRides(Ride[] rides) {
        return rides.length;
    }

    //Creating calculateAverageFarePerRide method
    public double calculateAverageFarePerRide(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            //calling calculateFare method here
            totalFare += calculateFare(ride.getDistance(), ride.getTime());
        }
        return totalFare / rides.length;
    }
}
