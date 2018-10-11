package com.company;

/**
 * Created by dpennebacker on 10/9/16.
 */
public class Automobile {

    public int mpg;
    public int gallons = 0;
    public int miles = 0;

    public Automobile(int milesPerGallon) {
        mpg = milesPerGallon;
    }

    public void fillUp(int endGallons){
        endGallons = endGallons + gallons;

    }

    public void takeTrip(int miles) {
        this.miles = miles;
        gallons = gallons - (miles / mpg);

    }

    public double reportFuel() {
        double fuel = gallons;
        return fuel;
    }
}
