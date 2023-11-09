package org.example;

public class CarInspectionService {

    // method
    public static boolean checkForTires(Car car) {
        return car.getNumberOfTires() == 4;
    }


    public static boolean checkForSeatBelt(Car car) {
        return car.isSeatBelt();
    }


    public static boolean checkForAirbag(Car car) {
        return car.isAirbag();
    }


    public static boolean checkForDoors(Car car) {
        return car.getNumberOfDoors() == 3 || car.getNumberOfDoors() == 5;
    }

    public static boolean checkCar(Car car) {
        return checkForTires(car) && checkForSeatBelt(car) && checkForAirbag(car) && checkForDoors(car);
    }


}
