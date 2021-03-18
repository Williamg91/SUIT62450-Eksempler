package org.example.Data;

public abstract class Sensor {


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    protected double value;

    public double getUpperlimit() {
        return upperlimit;
    }

    public void setUpperlimit(double upperlimit) {
        this.upperlimit = upperlimit;
    }

    public double getLowerlimit() {
        return lowerlimit;
    }

    public void setLowerlimit(double lowerlimit) {
        this.lowerlimit = lowerlimit;
    }

    protected double upperlimit;
    protected double lowerlimit;



}
