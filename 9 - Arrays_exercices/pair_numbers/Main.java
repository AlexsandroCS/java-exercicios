import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of values to place: ");
        int n = input.nextInt();

        int[] numberVetor = new int[n];

        for (int i = 0; i < numberVetor.length; i++){
            System.out.print("Enter the number: ");
            numberVetor[i] = input.nextInt();
        }

        int sum = 0;

        for (int x: numberVetor){
            int checkNumber = x % 2;
            if (checkNumber == 0){
                sum += 1;
                System.out.print(x+" ");
            }
        }
        System.out.printf("%nPair numbers = %d",sum);
    }
}