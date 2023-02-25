import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Number of numbers to be entered: ");
        int number = input.nextInt();

        int[] numberVetor = new int[number];

        for (int i = 0; i < numberVetor.length; i++){
            System.out.print("Enter the number: ");
            numberVetor[i] = input.nextInt();
        }

        int higherNumber = 0;
        int positionNumber = 0;

        for (int j = 0; j < numberVetor.length; j++){
            if (higherNumber < numberVetor[j]){
                higherNumber = numberVetor[j];
                positionNumber = j;
            }
        }
        System.out.println("Higher number: " + higherNumber);
        System.out.println("position of the largest number: " + positionNumber);
    }
}