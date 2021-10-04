package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StoreCalculationResult implements IStoreCalculationResult {
    private final String path;
    public StoreCalculationResult(String path) {
        this.path = path;
    }
    public void writeToFile(String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(this.path));
        writer.write(text);
        writer.close();
    }
}
