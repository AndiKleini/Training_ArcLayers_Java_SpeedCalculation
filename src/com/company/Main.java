package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // please enter input data
        System.out.println("Welcome to the speed calculator.");

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

        // perform calculation
        float speed = meter / seconds;

        // persist calculation
        String text = "Speed was calculated from distance-> " + meter + " m and time " + seconds + " secs " + "as " + speed;
        BufferedWriter writer = new BufferedWriter(new FileWriter("./out/output.txt"));
        writer.write(text);
        writer.close();
    }

    private static Integer TryParse(String toParse) {
        try {
            return Integer.parseInt(toParse);
        } catch (NumberFormatException ex) {
            return null;
        }
    }
}
