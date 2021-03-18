package org.example.Data;

import java.util.Random;

public class Temperatursensor extends Sensor{


    //enten skal I lave det som en del af konstruktøren

    @Override
    public double getValue() {
        Random random = new Random();

        value = lowerlimit + (upperlimit - lowerlimit) * random.nextDouble();
        return value;
    }
}
