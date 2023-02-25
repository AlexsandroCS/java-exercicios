package application;

import java.util.Scanner;

import util.Calculator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with a radius number: ");
        double radius = sc.nextDouble();

        double circ = Calculator.circunferenceFunc(radius);
        double vol = Calculator.volumeFunc(radius);

        System.out.printf("Circunference: %.2f%n",circ);
        System.out.printf("Volume: %.2f%n",vol);
        System.out.printf("Pi: %.2f%n",Calculator.PI);
    }
}