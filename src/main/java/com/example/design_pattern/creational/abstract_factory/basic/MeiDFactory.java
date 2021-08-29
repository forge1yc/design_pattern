package com.example.design_pattern.creational.abstract_factory.basic;

public class MeiDFactory implements Factory {

    @Override
    public Television newTelevision() {
        return new MeiDTelevision();
    }

    @Override
    public Refrigerator newRefrigerator() {
        return new MeiDRefrigerator();
    }
}