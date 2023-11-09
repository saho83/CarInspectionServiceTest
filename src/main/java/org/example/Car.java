package org.example;

import java.util.Objects;

public class Car {

    // attribute
    private int numberOfTires;
    private int numberOfDoors;
    private boolean seatBelt;
    private boolean airbag;


    // constructor
    public Car() {

    }
    public Car(int numberOfTires, int numberOfDoors, boolean seatBelt, boolean airbag) {
        this.numberOfTires = numberOfTires;
        this.numberOfDoors = numberOfDoors;
        this.seatBelt = seatBelt;
        this.airbag = airbag;
    }


    // getter
    public int getNumberOfTires() {
        return numberOfTires;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isSeatBelt() {
        return seatBelt;
    }

    public boolean isAirbag() {
        return airbag;
    }


    // setter
    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    // method




    // toString
    @Override
    public String toString() {
        return "Car{" +
                "numberOfTires=" + numberOfTires +
                ", numberOfDoors=" + numberOfDoors +
                ", seatBelt=" + seatBelt +
                ", airbag=" + airbag +
                '}';
    }


    // equals / hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfTires == car.numberOfTires && numberOfDoors == car.numberOfDoors && seatBelt == car.seatBelt && airbag == car.airbag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfTires, numberOfDoors, seatBelt, airbag);
    }
}
