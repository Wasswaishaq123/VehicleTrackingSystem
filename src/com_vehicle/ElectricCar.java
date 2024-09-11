package com_vehicle;

public class ElectricCar extends Car {
    private double batteryVoltage;

    public void setBatteryVoltage(double battery) {
        this.batteryVoltage = battery;
    }

    public double getBatteryVoltage() {
        return this.batteryVoltage;
        }
        @Override

    public void drive(int distance) {
        super.drive(distance);
        double kilometersDriven = distance / 10000.0;
        this.batteryVoltage -= kilometersDriven * 0.1;

    }
}
