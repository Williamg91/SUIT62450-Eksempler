package org.example;

import javafx.geometry.Point2D;
import javafx.scene.PointLight;
import javafx.scene.effect.Light;

public class Person {
    protected  String navn;
    protected int ID,alder;
    protected double height;

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

}
