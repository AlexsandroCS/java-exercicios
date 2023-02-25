import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter an integer that will represent the number of rows and columns in the matriz: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++){ // For da linha.
            for(int j = 0; j < mat[i].length; j++){ // For da coluna.
                System.out.printf("%nEnter a number that will be on the line[%d] colun[%d]: ",i,j);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Matriz diagonal values: ");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i]+" | ");
        }

        int nn = 0;
        for(int i = 0; i<mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if(mat[i][j] < 0){
                    nn += 1;
                }
            }
        }
        System.out.printf("%nThe number of negative numbers in the Matriz is: "+nn);

        sc.close();
    }
}