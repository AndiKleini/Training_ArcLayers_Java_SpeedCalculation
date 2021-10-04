package com.company;

import java.io.IOException;

public class ProcessSpeedCalculation implements IProcessSpeedCalculation {

    private IStoreCalculationResult storage;

    public ProcessSpeedCalculation(IStoreCalculationResult storage) {
        this.storage = storage;
    }

    public void processSpeedCalculation(InputParameters parameters) throws IOException {
        float speed = this.getSpeed(parameters.getMeter(), parameters.getSeconds());
        String text =
                "Speed was calculated from distance-> "
                        + parameters.getMeter() +
                        " m and time " +
                        parameters.getSeconds() +
                        " secs "
                        + "as "
                        + speed;
        this.storage.writeToFile(text);
    }

    private float getSpeed(float meter, float seconds) {
        return meter / seconds;
    }
}
