package com.example.design_pattern.creational.abstract_factory.basic;

public class TCLFactory implements Factory {

    @Override
    public Television newTelevision() {
        return new TCLTelevision();
    }

    @Override
    public Refrigerator newRefrigerator() {
        return new TCLRefrigerator();
    }
}