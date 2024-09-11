package com_vehicle_test;
import com_vehicle_Car;
import com_vehicle.ElectricCar;
public class vehicle_test {
    public static void main(String[] args) {
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();

        car.setSpeed(80.0);
        car.setFuelLevel(100.0f);

        electricCar.setSpeed(75.0);
        electricCar.setFuelLevel(100.0f);
        electricCar.setBatteryLevel(100.0);

        int Distance = 15000;
        car.drive(Distance);
        electricCar.drive(Distance);

        System.out.println("Car speed in mph:" + car.getSpeedMph());
        System.out.println("ElectricCar speed in mph:" + electricCar.getSpeedMph());

        System.out.println("Car distance traveled in km:" + car.getDistanceKm());
        System.out.println("EectricCar distance traveled in km:" + electricCar.getDistanceKm());

        System.out.println("Car remaining fuel level:" + car.getFuelLevel() + "%");
        System.out.println("ElectricCar remaining fuel level:" + electricCar.getFuelLevel() + "%");
        System.out.println("ElectricCar remaining battery level:" + electricCar.getBatteryLevel() + "%");

        double futureDistance = 90.0;
        int remainingFuel = car.calculateRemainingFuel (futureDistance);
        System.out.println("Car remaining fuel after driving" + futureDistance + "km:" + remainingFuel + "%");
    }
}