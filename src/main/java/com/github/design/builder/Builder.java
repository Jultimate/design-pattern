package com.github.design.builder;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/13 22:39
 * @Email: chongzhao66@gmail.com
 */
public class Builder {

    static AircraftCarrier aircraftCarrier = new AircraftCarrier();

    public AircraftCarrier builder() {
        return aircraftCarrier;
    }

    public static Builder classes(String classes) {
        aircraftCarrier.classes = classes;
        return new Builder();
    }

    public Builder propulsion(String propulsion) {
        aircraftCarrier.propulsion = propulsion;
        return this;
    }

    public Builder aircraft(String aircraft) {
        aircraftCarrier.aircraft = aircraft;
        return this;
    }

    public Builder power(String power) {
        aircraftCarrier.power = power;
        return this;
    }

    public Builder displacement(String displacement) {
        aircraftCarrier.displacement = displacement;
        return this;
    }
}
