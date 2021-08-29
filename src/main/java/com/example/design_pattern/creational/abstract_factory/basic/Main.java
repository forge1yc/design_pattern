package com.example.design_pattern.creational.abstract_factory.basic;

public class Main {


    public static void main(String[] args) {
        Factory factory = new TCLFactory();
        Television television = factory.newTelevision();
        Refrigerator refrigerator = factory.newRefrigerator();

        television.dosomething(); // 我是TCL电视机，我可以看电视
        refrigerator.dosomething(); // 我是TCL冰箱，我可以洗衣服

        factory = new MeiDFactory();
        television = factory.newTelevision();
        refrigerator = factory.newRefrigerator();

        television.dosomething(); // 我是美的电视机，我可以看电视
        refrigerator.dosomething(); // 我是美的冰箱，我可以洗衣服
    }

}
