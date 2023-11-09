package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {



    // testing for 4 wheels
    @Test
    void checkForTires_Return_true_When_Car_has_4_Wheels() {
        //GIVEN
        int numberOfTires = 4;
        Car car = new Car(numberOfTires, 0, false, false);
        //WHEN
        boolean actual = CarInspectionService.checkForTires(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkForTires_Return_false_When_Car_has_3_Wheels() {
        //GIVEN
        int numberOfTires = 3;
        Car car = new Car(numberOfTires, 0, false, false);
        //WHEN
        boolean actual = CarInspectionService.checkForTires(car);
        //THEN
        assertFalse(actual);
    }

    // testing seatBelt
    @Test
    void checkForSeatBelt_Return_true_When_Car_has_seatBelt() {
        //GIVEN
        boolean seatBelt = true;
        Car car = new Car(0, 0, true, false);
        //WHEN
        boolean actual = CarInspectionService.checkForSeatBelt(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkForSeatBelt_Return_false_When_Car_has_seatBelt() {
        //GIVEN
        boolean seatBelt = false;
        Car car = new Car(0, 0, false, false);
        //WHEN
        boolean actual = CarInspectionService.checkForSeatBelt(car);
        //THEN
        assertFalse(actual);
    }

    // testing airbag
    @Test
    void checkForAirbag_Return_true_When_Car_has_Airbag() {
        //GIVEN
        boolean airbag = true;
        Car car = new Car(0, 0, true, true);
        //WHEN
        boolean actual = CarInspectionService.checkForAirbag(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkForAirbag_Return_false_When_Car_has_Airbag() {
        //GIVEN
        boolean airbag = false;
        Car car = new Car(0, 0, true, false);
        //WHEN
        boolean actual = CarInspectionService.checkForAirbag(car);
        //THEN
        assertFalse(actual);
    }

    // testing doors
    @Test
    void checkForDoors_Return_true_When_Car_has_3_or_5_Doors() {
        //GIVEN
        boolean numberOfDoors = true;
        Car car = new Car(0, 5, true, true);
        //WHEN
        boolean actual = CarInspectionService.checkForDoors(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkForDoors_Return_false_When_Car_has_2_Doors() {
        //GIVEN
        boolean numberOfDoors = false;
        Car car = new Car(0, 2, true, true);
        //WHEN
        boolean actual = CarInspectionService.checkForDoors(car);
        //THEN
        assertFalse(actual);
    }

    @Test
    void checkCar_Return_true_When_Car_is_complete() {
        //GIVEN
        Car car = new Car(4, 3, true, true);
        //WHEN
        boolean actual = CarInspectionService.checkCar(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkCar_Return_false_When_Car_is_not_complete() {
        //GIVEN
        Car car = new Car(3, 3, true, true);
        //WHEN
        boolean actual = CarInspectionService.checkCar(car);
        //THEN
        assertFalse(actual);
    }








}