package org.example;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car(4,5,false,true);

        System.out.println(CarInspectionService.checkForDoors(audi));

        System.out.println(CarInspectionService.checkCar(audi));

    }
}