package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // please enter input data
        System.out.println("Welcome to the speed calculator.");

        var inputParameter = readInput();

        IProcessSpeedCalculation backendService = getBackendService();
        backendService.processSpeedCalculation(inputParameter);
    }

    private static Integer TryParse(String toParse) {
        try {
            return Integer.parseInt(toParse);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private static InputParameters readInput() {
        System.out.println("Please enter the distance in meters.");
        Scanner input = new Scanner(System.in);
        Integer meter;
        while ((meter = TryParse(input.next())) == null) {
            System.out.println("Invalid input ... must be a number.");
        }
        System.out.println("Please enter the time in seconds.");
        Integer seconds;
        while ((seconds = TryParse(input.next())) == null) {
            System.out.println("Invalid input ... must be a number.");
        }
        return new InputParameters(meter, seconds);
    }

    private static IProcessSpeedCalculation getBackendService() {
        return new ProcessSpeedCalculation(
                new StoreCalculationResult("./out/output.txt"));
    }
}
