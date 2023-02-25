import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int quantityArray;

        do {
            System.out.print("Enter the number of numbers that will be added to the Vector: ");
            quantityArray = input.nextInt();
        }while(quantityArray > 10);

        double[] array = new double[quantityArray];

        for(int i = 0; i < array.length; i++){
            System.out.print("Enter the number: ");
            array[i] = input.nextDouble();
        }

        double sum = 0;
        double average = 0;

        System.out.print("Values: ");

        for (double x:array){
            System.out.print(" " + x);
            sum += x;
        }

        System.out.println();
        System.out.println("Sum: " + sum);

        average = sum / array.length;
        System.out.println("Average: " + average);
    }
}