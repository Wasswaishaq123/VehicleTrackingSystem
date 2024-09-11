package com_vehicle;

public class Car {
    private double speedKph;
    private float fuelLevel;
    private int distanceTraveled;

    public void setSpeed(double speed) {
        this.speedKph = speed;
    }

    public void setFuelLevel(float fuel) {
        if (fuel < 0.0f) {
            this.fuelLevel = 0.0f;
        } else if (fuel > 100.0f) {
            this.fuelLevel = 100.0f;
        } else {
            this.fuelLevel = fuel;
        }
    }

    public void drive(int distance) {
        this.distanceTraveled += distance;
        float distanceKm = distance / 1000.0f;
        float fuelConsumed = distanceKm * 0.5f;
        this.fuelLevel -= fuelConsumed;
        if (this.fuelLevel < 0.0f) {
            this.fuelLevel = 0.0f;
        }
    }

    public double getSpeedMph() {
        return this.speedKph / 1.60934;
    }

    public int getDistanceKm() {
        return this.distanceTraveled / 1000;
    }

    public int calculateRemainingFuel(double distance) {
        double fuelConsumed = distance * 0.5;
        double remainingFuel = this.fuelLevel - fuelConsumed;
        if (remainingFuel < 0.0) {
            remainingFuel = 0.0;
        }
        return (int) remainingFuel;
    }

    public double getSpeedKph() {
        return this.speedKph;
    }

    public float getFuelLevel() {
        return this.fuelLevel;
    }

    public int getDistanceTraveled() {
        return this.distanceTraveled;
    }
}


