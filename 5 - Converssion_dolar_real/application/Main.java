package application;

import java.util.Scanner;
import until.Converssion;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is t he dollar price? ");
        double dollarValue = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarBought = sc.nextDouble();

        double resultConverssion = Converssion.returnValue(dollarValue,dollarBought);

        System.out.printf("Amount to be paid in reais = %.2f",resultConverssion);
    }
}