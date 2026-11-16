package com.pluralsight;
public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(1);
        slowRide.setCargoCapacity(10);

        Car myCar = new Car();
        myCar.setColor("Black");
        myCar.setFuelCapacity(15);
        myCar.setNumberOfPassengers(5);
        myCar.setCargoCapacity(100);

        SemiTruck truck = new SemiTruck();
        truck.setColor("White");
        truck.setFuelCapacity(200);
        truck.setNumberOfPassengers(2);
        truck.setCargoCapacity(5000);

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setColor("Blue");
        hovercraft.setFuelCapacity(50);
        hovercraft.setNumberOfPassengers(8);
        hovercraft.setCargoCapacity(500);

        System.out.println("Moped: " + slowRide.getColor());
        System.out.println("Car: " + myCar.getColor());
        System.out.println("SemiTruck: " + truck.getColor());
        System.out.println("Hovercraft: " + hovercraft.getColor());

        System.out.println("Moped Fuel: " + slowRide.getFuelCapacity());
        System.out.println("Car Passengers: " + myCar.getNumberOfPassengers());
        System.out.println("Truck Cargo: " + truck.getCargoCapacity());
        System.out.println("Hovercraft Fuel: " + hovercraft.getFuelCapacity());
    }
}