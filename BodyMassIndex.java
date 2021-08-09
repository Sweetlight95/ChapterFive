package chapter5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in kilogram: ");
        double weightInKilogram = input.nextDouble();
        System.out.println("Enter your height in meter: ");
        double heightInMeter = input.nextDouble();

        double bodyMassIndex = weightInKilogram / Math.pow(heightInMeter,2);
        System.out.printf("Your body mass index is %.2f: " , bodyMassIndex);

    }
}
