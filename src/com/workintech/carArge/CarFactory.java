package com.workintech.carArge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("Tesla", "Electrical Car",
                100, 4);

        CarSkeleton hybridCar = new HybridCar("Test", "test", 0.08,
                100, 4);

        CarSkeleton gasCar = new GasPoweredCar("Test1", "test1", 0.09, 4);

        //Object car = new CarSkeleton();

        System.out.println(electricCar.drive());
        System.out.println(hybridCar.drive());
        System.out.println(gasCar.drive());
    }
}
