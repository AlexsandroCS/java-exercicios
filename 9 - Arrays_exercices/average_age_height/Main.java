import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of people registered: ");
        int n  = input.nextInt();

        String[] nameVetor = new String[n];
        int[] ageVetor = new int[n];
        double[] heightVetor = new double[n];

        for(int i = 0; i < n; i++){
            System.out.printf("Enter the data of the %dª person %n",i+1);
            input.nextLine();

            System.out.print("Name: ");
            nameVetor[i] = input.nextLine();

            System.out.print("Age: ");
            ageVetor[i] = input.nextInt();

            System.out.print("Height: ");
            heightVetor[i] = input.nextDouble();

            System.out.println();
        }

        // Average height.
        double AverageHeight = 0;
        for (double x : heightVetor){
            AverageHeight += x;
        }
        System.out.printf("Average height: %.2f",AverageHeight / heightVetor.length);
        System.out.println();

        // Average age.
        double percentage = 0;
        for (int i : ageVetor) {
            if (i < 16) {
                percentage += 1;
            }
        }
        percentage = percentage * 100 / ageVetor.length;

        System.out.println("People under 16 years old: " + percentage + "%");

        for (int i = 0; i < ageVetor.length; i++){
            if (ageVetor[i] < 16){
                System.out.println(nameVetor[i]);
            }
        }
        input.close();
    }
}