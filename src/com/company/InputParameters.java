package com.company;

public class InputParameters {
    private float meter;
    private float seconds;

    public InputParameters(float meter, float seconds) {
        this.meter = meter;
        this.seconds = seconds;
    }

    public float getSeconds() {
        return seconds;
    }

    public void setSeconds(float seconds) {
        this.seconds = seconds;
    }

    public float getMeter() {
        return meter;
    }

    public void setMeter(float meter) {
        this.meter = meter;
    }
}
